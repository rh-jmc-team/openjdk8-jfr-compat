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

package jdk.jfr;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.HashMap;

public final class Recording implements Closeable {

    public Recording(Map<String, String> settings) {
    }

    public Recording() {
    }

    public Recording(Configuration configuration) {
    }

    public void start() {
    }

    public void scheduleStart(Duration delay) {
    }

    public boolean stop() {
    	return false;
    }

    public Map<String, String> getSettings() {
    	return new HashMap<String, String>();
    }

    public long getSize() {
        return 0;
    }

    public Instant getStopTime() {
        return null;
    }

    public Instant getStartTime() {
        return null;
    }

    public long getMaxSize() {
        return 0;
    }

    public Duration getMaxAge() {
        return null;
    }

    public String getName() {
        return null;
    }

    public void setSettings(Map<String, String> settings) {
    }

    public RecordingState getState() {
        return null;
    }

    @Override
    public void close() {
    }

    public Recording copy(boolean stop) {
        return this;
    }

    public void dump(Path destination) throws IOException {
    }

    public boolean isToDisk() {
        return false;
    }

    public void setMaxSize(long maxSize) {
    }

    public void setMaxAge(Duration maxAge) {
    }

    public void setDestination(Path destination) throws IOException {
    }

    public Path getDestination() {
    	return null;
    }

    public long getId() {
    	return 0;
    }

    public void setName(String name) {
    }

    public void setDumpOnExit(boolean dumpOnExit) {
    }

    public boolean getDumpOnExit() {
    	return false;
    }

    public void setToDisk(boolean disk) {
    }

    public InputStream getStream(Instant start, Instant end) throws IOException {
    	return null;
    }
    
    public Duration getDuration() {
    	return null;
    }

    public void setDuration(Duration duration) {
    }

    public EventSettings enable(String name) {
    	return getNewEventSettings();
    }

    public EventSettings disable(String name) {
    	return getNewEventSettings();
    }

    public EventSettings enable(Class<? extends Event> eventClass) {
    	return getNewEventSettings();
    }
    
    public EventSettings disable(Class<? extends Event> eventClass) {
    	return getNewEventSettings();
    }

    private EventSettings getNewEventSettings() {
    	return new EventSettings() {
        	@Override
        	public EventSettings with(String name, String value) {
        		return null;
        	};
        };
    }
}
