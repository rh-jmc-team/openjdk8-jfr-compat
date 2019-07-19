package jdk.jfr;

public interface FlightRecorderListener {

	abstract void recorderInitialized(FlightRecorder recorder);

    abstract void recordingStateChanged(Recording recording);
}
