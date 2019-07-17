package jdk.jfr.internal.tool;

import java.io.PrintWriter;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import jdk.jfr.AnnotationElement;
import jdk.jfr.DataAmount;
import jdk.jfr.Frequency;
import jdk.jfr.MemoryAddress;
import jdk.jfr.Percentage;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.consumer.RecordedClass;
import jdk.jfr.consumer.RecordedClassLoader;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedFrame;
import jdk.jfr.consumer.RecordedMethod;
import jdk.jfr.consumer.RecordedObject;
import jdk.jfr.consumer.RecordedStackTrace;
import jdk.jfr.consumer.RecordedThread;
import jdk.jfr.internal.PrivateAccess;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.Utils;

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
