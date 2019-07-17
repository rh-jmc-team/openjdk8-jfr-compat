package jdk.jfr.consumer;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import jdk.jfr.EventType;
import jdk.jfr.internal.LogLevel;
import jdk.jfr.internal.LogTag;
import jdk.jfr.internal.Logger;
import jdk.jfr.internal.MetadataDescriptor;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.consumer.ChunkHeader;
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
