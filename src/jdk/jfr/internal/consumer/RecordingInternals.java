package jdk.jfr.internal.consumer;

import java.io.IOException;
import java.util.List;

import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedObject;
import jdk.jfr.consumer.RecordingFile;
import jdk.jfr.internal.Type;

public abstract class RecordingInternals {

    public static RecordingInternals INSTANCE;

    public abstract boolean isLastEventInChunk(RecordingFile file);

    public abstract Object getOffsetDataTime(RecordedObject event, String name);

    public abstract List<Type> readTypes(RecordingFile file) throws IOException;

    public abstract void sort(List<RecordedEvent> events);

}
