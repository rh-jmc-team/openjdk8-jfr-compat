package jdk.jfr.consumer;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import jdk.jfr.EventType;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.consumer.RecordingInternals;

public final class RecordingFile implements Closeable {
    static{
        RecordingInternals.INSTANCE = new RecordingInternals() {
            public List<Type> readTypes(RecordingFile file) throws IOException {
                return null;
            }

            public boolean isLastEventInChunk(RecordingFile file) {
                return false;
            }

            @Override
            public Object getOffsetDataTime(RecordedObject event, String name) {
                return null;
            }

            @Override
            public void sort(List<RecordedEvent> events) {
            }
        };
    }

    public RecordingFile(Path file) throws IOException {
    }

    public RecordedEvent readEvent() throws IOException {
        return null;
    }

    public boolean hasMoreEvents() {
    	return false;
    }

    public List<EventType> readEventTypes() throws IOException {
        return null;
    }

    List<Type> readTypes() throws IOException  {
    	return null;
    }

    public void close() throws IOException {
    }

    public static List<RecordedEvent> readAllEvents(Path path) throws IOException {
    	return null;
    }

}
