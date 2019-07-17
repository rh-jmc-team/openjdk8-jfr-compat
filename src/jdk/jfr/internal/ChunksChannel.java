package jdk.jfr.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ChunksChannel implements ReadableByteChannel {

    public ChunksChannel(List<RepositoryChunk> chunks) throws IOException {
    }

    @Override
    public int read(ByteBuffer dst) throws IOException {
        return 0;
    }

    public long transferTo(FileChannel out) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
    }
}
