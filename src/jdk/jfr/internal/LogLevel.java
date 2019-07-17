package jdk.jfr.internal;

public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(3),
    WARN(4),
    ERROR(5);
    // must be in sync with JVM levels.

    final int level;

    LogLevel(int level) {
        this.level = level;
    }
}
