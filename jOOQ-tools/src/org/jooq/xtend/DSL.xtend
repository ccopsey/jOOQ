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
package org.jooq.xtend

import org.jooq.Constants

class DSL extends Generators {
    
    def static void main(String[] args) {
        val dsl = new DSL();
        dsl.generateRowValue();
        dsl.generateRowField();
        dsl.generateValues();
    }
    
    def generateRowValue() {
        val out = new StringBuilder();
        
        for (degree : (1..Constants::MAX_ROW_DEGREE)) {
            out.append('''
            
                /**
                 * Create a row value expression of degree <code>«degree»</code>.
                 * <p>
                 * Note: Not all databases support row value expressions, but many row value
                 * expression operations can be simulated on all databases. See relevant row
                 * value expression method Javadocs for details.
                 */
                «generatedMethod»
                @Support
                @Transition(
                    name = "ROW",
                    args = "Field+"
                )
                public static <«TN(degree)»> Row«degree»<«TN(degree)»> row(«TN_tn(degree)») {
                    return row(«Utils_field_tn(degree)»);
                }
            ''');
        }

        insert("org.jooq.impl.DSL", out, "row-value");
    }
    
    def generateRowField() {
        val out = new StringBuilder();
        
        for (degree : (1..Constants::MAX_ROW_DEGREE)) {
            out.append('''
            
                /**
                 * Create a row value expression of degree <code>«degree»</code>.
                 * <p>
                 * Note: Not all databases support row value expressions, but many row value
                 * expression operations can be simulated on all databases. See relevant row
                 * value expression method Javadocs for details.
                 */
                «generatedMethod»
                @Support
                @Transition(
                    name = "ROW",
                    args = "Field+"
                )
                public static <«TN(degree)»> Row«degree»<«TN(degree)»> row(«Field_TN_tn(degree)») {
                    return new RowImpl(«tn(degree)»);
                }
            ''');
        }

        insert("org.jooq.impl.DSL", out, "row-field");
    }
    
    def generateValues() {
        val out = new StringBuilder();
        
        for (degree : (1..Constants::MAX_ROW_DEGREE)) {
            out.append('''
            
                /**
                 * Create a <code>VALUES()</code> expression of degree <code>«degree»</code>.
                 * <p>
                 * The <code>VALUES()</code> constructor is a tool supported by some
                 * databases to allow for constructing tables from constant values.
                 * <p>
                 * If a database doesn't support the <code>VALUES()</code> constructor, it
                 * can be simulated using <code>SELECT .. UNION ALL ..</code>. The following
                 * expressions are equivalent:
                 * <p>
                 * <pre><code>
                 * -- Using VALUES() constructor
                 * VALUES(«FOR d : (1..degree) SEPARATOR ', '»val1_«d»«ENDFOR»),
                 *       («FOR d : (1..degree) SEPARATOR ', '»val2_«d»«ENDFOR»),
                 *       («FOR d : (1..degree) SEPARATOR ', '»val3_«d»«ENDFOR»)
                 * AS "v"(«FOR d : (1..degree) SEPARATOR ', '»"c«d»"  «ENDFOR»)
                 *
                 * -- Using UNION ALL
                 * SELECT «FOR d : (1..degree) SEPARATOR ', '»val1_«d» AS "c«d»"«ENDFOR») UNION ALL
                 * SELECT «FOR d : (1..degree) SEPARATOR ', '»val1_«d» AS "c«d»"«ENDFOR») UNION ALL
                 * SELECT «FOR d : (1..degree) SEPARATOR ', '»val1_«d» AS "c«d»"«ENDFOR»)
                 * </code></pre>
                 * <p>
                 * Use {@link Table#as(String, String...)} to rename the resulting table and
                 * its columns.
                 */
                «generatedMethod»
                @Support
                @Transition(
                    name = "VALUES",
                    args = "Row+"
                )
                public static <«TN(degree)»> Table<Record«degree»<«TN(degree)»>> values(Row«degree»<«TN(degree)»>... rows) {
                    return new Values<Record«degree»<«TN(degree)»>>(rows).as("v", «FOR d : (1..degree) SEPARATOR ', '»"c«d»"«ENDFOR»);
                }
            ''');
        }

        insert("org.jooq.impl.DSL", out, "values");
    }
}