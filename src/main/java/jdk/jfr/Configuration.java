/*
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package jdk.jfr;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;


public final class Configuration {

	public Map<String, String> getSettings() {
	    return new HashMap<String,String>();
	}

	public String getName() {
	    return null;
	}

	public String getLabel() {
	    return null;
	}

	public String getDescription() {
	    return null;
	}

	public String getProvider() {
	    return null;
	}

	public String getContents() {
	    return null;
	}

	public static Configuration create(Path path) throws IOException, ParseException {
		return new Configuration();
	}

	public static Configuration create(Reader reader) throws IOException, ParseException {
		return new Configuration();
	}

	public static Configuration getConfiguration(String name) throws IOException, ParseException {
		return new Configuration();
	}

	public static List<Configuration> getConfigurations() {
	    return Collections.emptyList();
	}
}
