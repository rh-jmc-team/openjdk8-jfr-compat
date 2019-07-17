package jdk.jfr.internal.instrument;

import java.io.IOException;

@JIInstrumentationTarget("java.net.Socket$SocketInputStream")
final class SocketInputStreamInstrumentor {

    @JIInstrumentationMethod
    public int read(byte b[], int off, int length) throws IOException {
        return 0;
    }

}
