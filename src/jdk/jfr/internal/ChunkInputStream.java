package jdk.jfr.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

final class ChunkInputStream extends InputStream {

    ChunkInputStream(List<RepositoryChunk> chunks) throws IOException {
    }

    @Override
    public int available() throws IOException {
        return 0;
    }

    @Override
    public int read() throws IOException {
    	return 0;
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    protected void finalize() throws Throwable {
    }
}
