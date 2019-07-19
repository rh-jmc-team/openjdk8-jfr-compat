package jdk.jfr.consumer;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import jdk.jfr.EventType;

public final class RecordingFile implements Closeable {

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

    public void close() throws IOException {
    }

    public static List<RecordedEvent> readAllEvents(Path path) throws IOException {
    	return null;
    }

}
