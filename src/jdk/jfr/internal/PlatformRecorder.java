package jdk.jfr.internal;

import java.util.List;
import java.util.Map;
import java.util.Timer;

import jdk.jfr.FlightRecorder;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;

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
    	return null;
    }

    public synchronized void fillWithRecordedData(PlatformRecording target, Boolean pathToGcRoots) {
    }

}
