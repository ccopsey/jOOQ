/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import static org.jooq.Clause.CONDITION;
import static org.jooq.Clause.CONDITION_COMPARISON;
import static org.jooq.impl.DSL.inline;
import static org.jooq.impl.DSL.val;

import org.jooq.BindContext;
import org.jooq.Clause;
import org.jooq.Condition;
import org.jooq.Context;
import org.jooq.Field;
import org.jooq.RenderContext;
import org.jooq.exception.DataAccessException;

/**
 * Abstraction for various "contains" operations
 *
 * @author Lukas Eder
 */
class Contains<T> extends AbstractCondition {

    /**
     * Generated UID
     */
    private static final long     serialVersionUID = 6146303086487338550L;
    private static final Clause[] CLAUSES          = { CONDITION, CONDITION_COMPARISON };

    private final Field<T>        lhs;
    private final Field<T>        rhs;
    private final T               value;

    Contains(Field<T> field, T value) {
        this.lhs = field;
        this.rhs = null;
        this.value = value;
    }

    Contains(Field<T> field, Field<T> rhs) {
        this.lhs = field;
        this.rhs = rhs;
        this.value = null;
    }

    @Override
    public final void toSQL(RenderContext context) {
        context.visit(condition());
    }

    @Override
    public final void bind(BindContext context) throws DataAccessException {
        context.visit(condition());
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }

    private final Condition condition() {

        // [#1107] Some dialects support "contains" operations for ARRAYs
        if (lhs.getDataType().isArray()) {
            return new PostgresArrayContains();
        }

        // "contains" operations on Strings
        else {
            Field<String> concat;

            if (rhs == null) {
                concat = DSL.concat(inline("%"), Utils.escapeForLike(value), inline("%"));
            }
            else {
                concat = DSL.concat(inline("%"), Utils.escapeForLike(rhs), inline("%"));
            }

            return lhs.like(concat, Utils.ESCAPE);
        }
    }

    /**
     * The Postgres array contains operator
     */
    private class PostgresArrayContains extends AbstractCondition {

        /**
         * Generated UID
         */
        private static final long serialVersionUID = 8083622843635168388L;

        @Override
        public final void toSQL(RenderContext context) {
            context.visit(lhs).sql(" @> ").visit(rhs());
        }

        @Override
        public final void bind(BindContext context) throws DataAccessException {
            context.visit(lhs).visit(rhs());
        }

        @Override
        public final Clause[] clauses(Context<?> ctx) {
            return CLAUSES;
        }

        private final Field<T> rhs() {
            return (rhs == null) ? val(value, lhs) : rhs;
        }
    }
}
