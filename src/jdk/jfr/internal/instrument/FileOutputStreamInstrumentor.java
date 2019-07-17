package jdk.jfr.internal.instrument;

import java.io.IOException;

@JIInstrumentationTarget("java.io.FileOutputStream")
final class FileOutputStreamInstrumentor {

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
