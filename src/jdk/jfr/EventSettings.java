package jdk.jfr;

import java.time.Duration;
import java.util.Map;

public abstract class EventSettings {

    EventSettings() {
    }

    final public EventSettings withStackTrace() {
    	return null;
    }

    final public EventSettings withoutStackTrace() {
    	return null;
    }

    final public EventSettings withoutThreshold() {
    	return null;
    }

    final public EventSettings withPeriod(Duration duration) {
    	return null;
    }

    final public EventSettings withThreshold(Duration duration) {
    	return null;
    }

    abstract public EventSettings with(String name, String value);

    abstract Map<String, String> toMap();
}
