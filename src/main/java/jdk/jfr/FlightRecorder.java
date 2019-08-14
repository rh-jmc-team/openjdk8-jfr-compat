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

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import jdk.jfr.internal.Warnings;

public final class FlightRecorder {

	static {
		Warnings.usingStubJFR();
	}

	private static volatile FlightRecorder platformRecorder;

	public List<Recording> getRecordings() {
	    return Collections.emptyList();
	}

	public Recording takeSnapshot() {
	    return new Recording();
	}

	public static void register(Class<? extends Event> eventClass) {
	}

	public static void unregister(Class<? extends Event> eventClass) {
	}

	public static FlightRecorder getFlightRecorder() throws IllegalStateException, SecurityException {
		if (platformRecorder == null) {
			platformRecorder = new FlightRecorder();
		}
		return platformRecorder;
	}

	public static void addPeriodicEvent(Class<? extends Event> eventClass, Runnable hook) throws SecurityException {
	}

	public static boolean removePeriodicEvent(Runnable hook) throws SecurityException {
	    return false;
	}

	public List<EventType> getEventTypes() {
	    return Collections.emptyList();
	}

	public static void addListener(FlightRecorderListener changeListener) {
	}

	public static boolean removeListener(FlightRecorderListener changeListener) {
	     return false;
	}

	public static boolean isAvailable() {
	    return false;
	}

	public static boolean isInitialized() {
	    return false;
	}
}
