package jdk.jfr.internal;

import static jdk.jfr.internal.LogLevel.INFO;
import static jdk.jfr.internal.LogLevel.TRACE;
import static jdk.jfr.internal.LogLevel.WARN;
import static jdk.jfr.internal.LogTag.JFR;
import static jdk.jfr.internal.LogTag.JFR_SYSTEM;

import java.io.IOException;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

import jdk.jfr.EventType;
import jdk.jfr.FlightRecorder;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;
import jdk.jfr.RecordingState;
import jdk.jfr.events.ActiveRecordingEvent;
import jdk.jfr.events.ActiveSettingEvent;
import jdk.jfr.internal.SecuritySupport.SecureRecorderListener;
import jdk.jfr.internal.instrument.JDKEvents;

public final class PlatformRecorder {

    public PlatformRecorder() throws Exception {
    }

    public synchronized PlatformRecording newRecording(Map<String, String> settings) {
        return null;
    }

    public PlatformRecording newTemporaryRecording() {
        return null;
    }

    synchronized void finish(PlatformRecording recording) {
    }

    public synchronized List<PlatformRecording> getRecordings() {
        return null;
    }

    public synchronized static void addListener(FlightRecorderListener changeListener) {
    }

    public synchronized static boolean removeListener(FlightRecorderListener changeListener) {
        return false;
    }

    static synchronized List<FlightRecorderListener> getListeners() {
        return null;
    }

    Timer getTimer() {
        return null;
    }

    public static void notifyRecorderInitialized(FlightRecorder recorder) {
    }

    synchronized void destroy() {
    }

    synchronized void start(PlatformRecording recording) {
    }

    synchronized void stop(PlatformRecording recording) {
    }

    void updateSettings() {
    }

    void updateSettingsButIgnoreRecording(PlatformRecording ignoreMe) {
    }

    synchronized void rotateDisk() {
    }

    synchronized Recording newCopy(PlatformRecording r, boolean stop) {
    }

    public synchronized void fillWithRecordedData(PlatformRecording target, Boolean pathToGcRoots) {
    }

}
