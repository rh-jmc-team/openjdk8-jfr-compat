package jdk.jfr;

import static jdk.jfr.internal.LogLevel.DEBUG;
import static jdk.jfr.internal.LogLevel.INFO;
import static jdk.jfr.internal.LogTag.JFR;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import jdk.jfr.internal.JVM;
import jdk.jfr.internal.JVMSupport;
import jdk.jfr.internal.LogLevel;
import jdk.jfr.internal.Logger;
import jdk.jfr.internal.MetadataRepository;
import jdk.jfr.internal.Options;
import jdk.jfr.internal.PlatformRecorder;
import jdk.jfr.internal.PlatformRecording;
import jdk.jfr.internal.Repository;
import jdk.jfr.internal.RequestEngine;
import jdk.jfr.internal.Utils;

public final class FlightRecorder {
    private static volatile FlightRecorder platformRecorder;
    private static volatile boolean initialized;
    private final PlatformRecorder internal;

    private FlightRecorder(PlatformRecorder internal) {
    }

    public List<Recording> getRecordings() {
        return null;
    }

    public Recording takeSnapshot() {
    	return null;
    }

    public static void register(Class<? extends Event> eventClass) {
    }

    public static void unregister(Class<? extends Event> eventClass) {
    }

    public static FlightRecorder getFlightRecorder() throws IllegalStateException, SecurityException {
        return null;
    }

    public static void addPeriodicEvent(Class<? extends Event> eventClass, Runnable hook) throws SecurityException {
    }

    public static boolean removePeriodicEvent(Runnable hook) throws SecurityException {
    	return false;
    }

    public List<EventType> getEventTypes() {
        return null;
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

    PlatformRecorder getInternal() {
        return null;
    }
}
