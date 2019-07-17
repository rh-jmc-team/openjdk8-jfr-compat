package jdk.jfr.internal.instrument;

public final class ThrowableTracer {

    public static void traceError(Error e, String message) {
    }

    public static void traceThrowable(Throwable t, String message) {
    }

    public static long numThrowables() {
        return 0;
    }
}
