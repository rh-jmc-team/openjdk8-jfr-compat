package jdk.jfr;

import java.time.Duration;
import java.util.Map;

public abstract class EventSettings {

    EventSettings() {
    }

    final public EventSettings withStackTrace() {
    }

    final public EventSettings withoutStackTrace() {
    }

    final public EventSettings withoutThreshold() {
    }

    final public EventSettings withPeriod(Duration duration) {
    }

    final public EventSettings withThreshold(Duration duration) {
    }

    abstract public EventSettings with(String name, String value);

    abstract Map<String, String> toMap();
}
