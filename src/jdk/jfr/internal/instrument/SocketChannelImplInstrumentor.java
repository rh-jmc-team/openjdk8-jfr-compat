package jdk.jfr.internal.instrument;

import java.io.IOException;
import java.nio.ByteBuffer;

@JIInstrumentationTarget("sun.nio.ch.SocketChannelImpl")
final class SocketChannelImplInstrumentor {

    @JIInstrumentationMethod
    public int read(ByteBuffer dst) throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public long read(ByteBuffer[] dsts, int offset, int length) throws IOException {
    	return 0;
    }

    @JIInstrumentationMethod
    public int write(ByteBuffer buf) throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public long write(ByteBuffer[] srcs, int offset, int length) throws IOException {
        return 0;
    }

}
