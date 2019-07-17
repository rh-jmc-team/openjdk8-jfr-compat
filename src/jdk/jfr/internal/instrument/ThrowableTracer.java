package jdk.jfr.internal.instrument;

import jdk.jfr.events.ErrorThrownEvent;
import jdk.jfr.events.ExceptionThrownEvent;

public final class ThrowableTracer {

    public static void traceError(Error e, String message) {
    }

    public static void traceThrowable(Throwable t, String message) {
    }

    public static long numThrowables() {
        return 0;
    }
}
