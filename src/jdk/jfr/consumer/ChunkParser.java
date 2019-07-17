package jdk.jfr.consumer;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import jdk.jfr.EventType;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.consumer.RecordingInput;

final class ChunkParser {

	public ChunkParser(RecordingInput input) throws IOException {
    }

    public RecordedEvent readEvent() throws IOException {
        return null;
    }

    public Collection<Type> getTypes() {
        return null;
    }

    public List<EventType> getEventTypes() {
        return null;
    }

    public boolean isLastChunk() {
        return false;
    }

    public ChunkParser nextChunkParser() throws IOException {
        return null;
    }
}
