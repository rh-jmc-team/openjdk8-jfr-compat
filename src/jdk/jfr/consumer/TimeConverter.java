package jdk.jfr.consumer;

import java.time.ZoneOffset;

import jdk.jfr.internal.consumer.ChunkHeader;


final class TimeConverter {

    TimeConverter(ChunkHeader chunkHeader, int rawOffset) {
    }

    public long convertTimestamp(long ticks) {
        return 0;
    }

    public long convertTimespan(long ticks) {
        return 0;
    }

    public ZoneOffset getZoneOffset() {
        return null;
    }
}
