package jdk.jfr.internal.instrument;

import java.io.IOException;

@JIInstrumentationTarget("java.io.RandomAccessFile")
final class RandomAccessFileInstrumentor {

    @JIInstrumentationMethod
    public int read() throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public int read(byte b[]) throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public int read(byte b[], int off, int len) throws IOException {
        return 0;
    }

    @JIInstrumentationMethod
    public void write(int b) throws IOException {
    }

    @JIInstrumentationMethod
    public void write(byte b[]) throws IOException {
    }

    @JIInstrumentationMethod
    public void write(byte b[], int off, int len) throws IOException {
    }

}
