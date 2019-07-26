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
        return new String("");
    }

    public void setSettings(Map<String, String> settings) {
    }

    public RecordingState getState() {
        return RecordingState.CLOSED;
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
