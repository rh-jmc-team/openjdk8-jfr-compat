package jdk.jfr.internal.instrument;

import java.io.IOException;

import jdk.jfr.events.FileReadEvent;

@JIInstrumentationTarget("java.io.FileInputStream")
final class FileInputStreamInstrumentor {

    @JIInstrumentationMethod
    public int read() throws IOException {
        return null;
    }

    @JIInstrumentationMethod
    public int read(byte b[]) throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public int read(byte b[], int off, int len) throws IOException {
    	return 0;
    }

}
