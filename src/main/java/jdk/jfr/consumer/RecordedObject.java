/*
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2019, Red Hat Inc. All rights reserved.
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

package jdk.jfr.consumer;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Collections;

import jdk.jfr.ValueDescriptor;

public class RecordedObject {

    public boolean hasField(String name) {
        return false;
    }

    final public <T> T getValue(String name) {
        return null;
    }

    public List<ValueDescriptor> getFields() {
        return Collections.emptyList();
    }

    public final boolean getBoolean(String name) {
    	return false;
    }

    public final byte getByte(String name) {
    	return 0;
    }

    public final char getChar(String name) {
    	return 0;
    }

    public final short getShort(String name) {
    	return 0;
    }

    public final int getInt(String name) {
    	return 0;
    }

    public final float getFloat(String name) {
        return 0;
    }

    public final long getLong(String name) {
        return 0;
    }

    public final double getDouble(String name) {
        return 0;
    }

   public final String getString(String name) {
        return null;
    }

    public final Duration getDuration(String name) {
        return null;
    }
    
    public final Instant getInstant(String name) {
       return null;
    }

    public final RecordedClass getClass(String name) {
        return new RecordedClass();
    }

    public final RecordedThread getThread(String name) {
        return new RecordedThread();
    }

    @Override
    final public String toString() {
        return null;
    }

}
