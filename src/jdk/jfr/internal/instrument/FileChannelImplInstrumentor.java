package jdk.jfr.internal.instrument;

import java.io.IOException;
import java.nio.ByteBuffer;

@JIInstrumentationTarget("sun.nio.ch.FileChannelImpl")
final class FileChannelImplInstrumentor {

    @JIInstrumentationMethod
    public void force(boolean metaData) throws IOException {
    }

    @JIInstrumentationMethod
    public int read(ByteBuffer dst) throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public int read(ByteBuffer dst, long position) throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public long read(ByteBuffer[] dsts, int offset, int length) throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public int write(ByteBuffer src) throws IOException {
       return 0;
    }

    @JIInstrumentationMethod
    public int write(ByteBuffer src, long position) throws IOException {
    	return 0;
    }

    @JIInstrumentationMethod
    public long write(ByteBuffer[] srcs, int offset, int length) throws IOException {
        return 0;
    }
}
