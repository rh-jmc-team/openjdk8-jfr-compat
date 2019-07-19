package jdk.jfr;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class FlightRecorder {
   
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
}
