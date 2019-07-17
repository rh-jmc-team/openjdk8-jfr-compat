package jdk.jfr.internal.tool;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;

import jdk.jfr.EventType;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedObject;

abstract class EventPrintWriter extends StructuredWriter {

    enum ValueType {
        TIMESPAN, TIMESTAMP, OTHER
    }

    protected static final String STACK_TRACE_FIELD = "stackTrace";
    protected static final String EVENT_THREAD_FIELD = "eventThread";

    EventPrintWriter(PrintWriter p) {
        super(p);
    }

    abstract protected void print(List<RecordedEvent> events);

    void print(Path source) throws FileNotFoundException, IOException {
    }

    protected void printEnd() {
    }

    protected void printBegin() {
    }

    public final void setEventFilter(Predicate<EventType> eventFilter) {
    }

    protected final boolean acceptEvent(RecordedEvent event) {
        return false;
    }

    protected final int getStackDepth() {
        return 0;
    }

    protected final boolean isLateField(String name) {
        return false;
    }

    public void setStackDepth(int stackDepth) {
    }

    protected Object getValue(RecordedObject object, ValueDescriptor v) {
    	return null;
    }
 
}
