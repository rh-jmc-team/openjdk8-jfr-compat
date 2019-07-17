package jdk.jfr.internal;

import java.io.IOException;

public final class JVMSupport {

    public static void ensureWithInternalError() {
    }

    public static void ensureWithIOException() throws IOException {
    }

    public static void ensureWithIllegalStateException() {
    }

    public static boolean isNotAvailable() {
        return false;
    }

    public static void tryToInitializeJVM() {
    }
}
