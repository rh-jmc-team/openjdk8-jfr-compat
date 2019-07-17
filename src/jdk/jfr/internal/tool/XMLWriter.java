package jdk.jfr.internal.tool;

import java.io.PrintWriter;
import java.util.List;

import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedObject;

final class XMLWriter extends EventPrintWriter {
    public XMLWriter(PrintWriter destination) {
        super(destination);
    }

    @Override
    protected void printBegin() {
    }

    @Override
    protected void printEnd() {
    }

    @Override
    protected void print(List<RecordedEvent> events) {
    }

    public void printObject(RecordedObject struct) {
    }

}
