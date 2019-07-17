package jdk.jfr;

public interface FlightRecorderListener {

    default void recorderInitialized(FlightRecorder recorder) {
    }

    default void recordingStateChanged(Recording recording) {
    }
}
