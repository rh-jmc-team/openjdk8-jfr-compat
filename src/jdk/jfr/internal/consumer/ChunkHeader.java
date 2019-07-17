package jdk.jfr.internal.consumer;

import java.io.IOException;

import jdk.jfr.internal.MetadataDescriptor;

public final class ChunkHeader {

	public ChunkHeader(RecordingInput input) throws IOException {
    }

    public ChunkHeader nextHeader() throws IOException {
        return null;
    }

    public MetadataDescriptor readMetadata() throws IOException {
        return null;
    }

    public boolean isLastChunk() {
        return false;
    }

    public short getMajor() {
        return 0;
    }

    public short getMinor() {
        return 0;
    }

    public long getAbsoluteChunkStart() {
        return 0;
    }

    public long getConstantPoolPosition() {
        return 0;
    }

    public long getStartTicks() {
        return 0;
    }

    public double getTicksPerSecond() {
        return 0;
    }

    public long getStartNanos() {
        return 0;
    }

    public long getEnd() {
        return 0;
    }

    public long getSize() {
        return 0;
    }

    public long getDurationNanos() {
        return 0;
    }

    public RecordingInput getInput() {
        return null;
    }

    public long getEventStart() {
        return 0;
    }

}
