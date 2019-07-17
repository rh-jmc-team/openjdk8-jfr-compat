package jdk.jfr.internal;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.Objects;

import jdk.jfr.internal.SecuritySupport.SafePath;

final class RepositoryChunk {
    static final Comparator<RepositoryChunk> END_TIME_COMPARATOR = new Comparator<RepositoryChunk>() {
        @Override
        public int compare(RepositoryChunk c1, RepositoryChunk c2) {
            return 0;
        }
    };

    RepositoryChunk(SafePath path, Instant startTime) throws Exception {
    }

    public SafePath getUnfishedFile() {
        return null;
    }

    void finish(Instant endTime) {
    }

    public Instant getStartTime() {
        return null;
    }

    public Instant getEndTime() {
        return null;
    }

    public synchronized void use() {
    }

    public synchronized void release() {
    }

    @Override
    @SuppressWarnings("deprecation")
    protected void finalize() {
    }

    public long getSize() {
        return 0;
    }

    public boolean isFinished() {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }

    ReadableByteChannel newChannel() throws IOException {
        return null;
    }

    public boolean inInterval(Instant startTime, Instant endTime) {
        return false;
    }

    public SafePath getFile() {
        return null;
    }
}
