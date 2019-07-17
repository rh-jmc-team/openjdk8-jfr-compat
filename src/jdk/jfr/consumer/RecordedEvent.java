package jdk.jfr.consumer;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import jdk.jfr.EventType;
import jdk.jfr.ValueDescriptor;

public final class RecordedEvent extends RecordedObject {
    final long endTime;

    RecordedEvent(EventType type, List<ValueDescriptor> vds, Object[] values, long startTime, long endTime, TimeConverter timeConverter) {
        super(vds, values, timeConverter);
        this.endTime = 0;
    }

    public RecordedStackTrace getStackTrace() {
        return null;
    }

    public RecordedThread getThread() {
        return null;
    }

    public EventType getEventType() {
        return null;
    }

    public Instant getStartTime() {
        return null;
    }

    public Instant getEndTime() {
        return null;
    }

    public Duration getDuration() {
        return null;
    }

    @Override
    public List<ValueDescriptor> getFields() {
        return null;
    }
}
