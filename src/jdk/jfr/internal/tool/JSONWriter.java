package jdk.jfr.internal.tool;

import java.io.PrintWriter;
import java.util.List;

import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedObject;

final class JSONWriter extends EventPrintWriter {

    public JSONWriter(PrintWriter writer) {
    	super(writer);
    }

    @Override
    protected void printBegin() {
    }

    @Override
    protected void print(List<RecordedEvent> events) {
    }

    @Override
    protected void printEnd() {
    }
    void printValue(boolean first, boolean arrayElement, String name, Object value) {
    }

    public void printObject(RecordedObject object) {
    }

}
