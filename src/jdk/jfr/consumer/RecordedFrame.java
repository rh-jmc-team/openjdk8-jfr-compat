package jdk.jfr.consumer;

import java.util.List;

import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.Type;

public final class RecordedFrame extends RecordedObject {

    static ObjectFactory<RecordedFrame> createFactory(Type type, TimeConverter timeConverter) {
    	return null;
    }

    RecordedFrame(List<ValueDescriptor> desc, Object[] objects, TimeConverter timeConverter) {
        super(desc, objects, timeConverter);
    }

    public boolean isJavaFrame() {
    	return false;
    }

    public int getBytecodeIndex() {
        return 0;
    }

    public int getLineNumber() {
        return 0;
    }

    public String getType() {
        return null;
    }

    public RecordedMethod getMethod() {
        return null;
    }
}
