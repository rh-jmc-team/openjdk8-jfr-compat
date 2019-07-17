package jdk.jfr.internal;

import java.util.function.Supplier;

public final class Logger {

    public static void log(LogTag logTag, LogLevel logLevel, String message) {
    }

    public static void log(LogTag logTag, LogLevel logLevel, Supplier<String> messageSupplier) {
    }

    public static boolean shouldLog(LogTag tag, LogLevel level) {
        return false;
    }
}
