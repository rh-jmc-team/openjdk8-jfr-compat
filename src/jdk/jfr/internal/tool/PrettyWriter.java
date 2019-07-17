package jdk.jfr.internal.tool;

import java.io.PrintWriter;
import java.util.List;

import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedObject;
import jdk.jfr.internal.Type;

public final class PrettyWriter extends EventPrintWriter {

    public PrettyWriter(PrintWriter destination) {
        super(destination);
    }

    @Override
    protected void print(List<RecordedEvent> events) {
    }

    public void printType(Type t) {
    }

    public void print(RecordedEvent event) {
    }

    public void print(RecordedObject struct, String postFix) {
    }

    void printObject(RecordedObject object, long arraySize) {
    }

    List<String> decodeDescriptors(String descriptor, String arraySize) {
        return null;
    }

    public void setShowIds(boolean showIds) {
    }

}
