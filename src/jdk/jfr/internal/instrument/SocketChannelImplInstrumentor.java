package jdk.jfr.internal.instrument;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

import jdk.jfr.events.SocketReadEvent;
import jdk.jfr.events.SocketWriteEvent;

@JIInstrumentationTarget("sun.nio.ch.SocketChannelImpl")
final class SocketChannelImplInstrumentor {

    @JIInstrumentationMethod
    public int read(ByteBuffer dst) throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public long read(ByteBuffer[] dsts, int offset, int length) throws IOException {
    	return bytesRead;
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
