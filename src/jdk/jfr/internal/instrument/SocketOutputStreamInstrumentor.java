package jdk.jfr.internal.instrument;

import java.io.IOException;

@JIInstrumentationTarget("java.net.Socket$SocketOutputStream")
final class SocketOutputStreamInstrumentor {

    @JIInstrumentationMethod
    public void write(byte b[], int off, int len) throws IOException {
    }

}
