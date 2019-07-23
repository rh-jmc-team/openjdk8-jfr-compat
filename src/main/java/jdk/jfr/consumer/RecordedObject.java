/*
 * Copyright (c) 2019, Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2019, Red Hat Inc. All rights reserved.
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The contents of this file are subject to the terms of either the Universal Permissive License
 * v 1.0 as shown at http://oss.oracle.com/licenses/upl
 *
 * or the following license:
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted
 * provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions
 * and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other materials provided with
 * the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to
 * endorse or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jdk.jfr.consumer;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.ArrayList;

import jdk.jfr.ValueDescriptor;

public class RecordedObject {

    public boolean hasField(String name) {
        return false;
    }

    final public <T> T getValue(String name) {
        return null;
    }

    public List<ValueDescriptor> getFields() {
        return new ArrayList<ValueDescriptor>();
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
