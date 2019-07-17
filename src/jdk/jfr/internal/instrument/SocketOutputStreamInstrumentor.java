package jdk.jfr.internal.instrument;

import java.io.IOException;

import jdk.jfr.events.SocketWriteEvent;

@JIInstrumentationTarget("java.net.Socket$SocketOutputStream")
final class SocketOutputStreamInstrumentor {

    @JIInstrumentationMethod
    public void write(byte b[], int off, int len) throws IOException {
    }

}
