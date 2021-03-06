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
package org.jooq;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;

import org.xml.sax.InputSource;

/**
 * The <code>Loader</code> API is used for configuring data loads.
 * <p>
 * The step in constructing the {@link Loader} object where you can specify the
 * load type and data source.
 *
 * @author Lukas Eder
 */
public interface LoaderSourceStep<R extends TableRecord<R>> {

    /**
     * Load CSV data
     */
    @Support
    LoaderCSVStep<R> loadCSV(File file) throws FileNotFoundException;

    /**
     * Load CSV data
     */
    @Support
    LoaderCSVStep<R> loadCSV(String data);

    /**
     * Load CSV data
     */
    @Support
    LoaderCSVStep<R> loadCSV(InputStream stream);

    /**
     * Load CSV data
     */
    @Support
    LoaderCSVStep<R> loadCSV(Reader reader);

    /**
     * Load XML data
     */
    @Support
    LoaderXMLStep<R> loadXML(File file) throws FileNotFoundException;

    /**
     * Load XML data
     */
    @Support
    LoaderXMLStep<R> loadXML(String data);

    /**
     * Load XML data
     */
    @Support
    LoaderXMLStep<R> loadXML(InputStream stream);

    /**
     * Load XML data
     */
    @Support
    LoaderXMLStep<R> loadXML(Reader reader);

    /**
     * Load XML data
     */
    @Support
    LoaderXMLStep<R> loadXML(InputSource source);
}
