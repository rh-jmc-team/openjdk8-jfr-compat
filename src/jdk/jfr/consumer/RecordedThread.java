package jdk.jfr.consumer;

import java.util.List;

import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.Type;

public final class RecordedThread extends RecordedObject {

    static ObjectFactory<RecordedThread> createFactory(Type type, TimeConverter timeConverter) {
        return new ObjectFactory<RecordedThread>(type) {
            @Override
            RecordedThread createTyped(List<ValueDescriptor> desc, long id, Object[] object) {
                return new RecordedThread(desc, id, object, timeConverter);
            }
        };
    }

    private RecordedThread(List<ValueDescriptor> descriptors, long id, Object[] values,  TimeConverter timeConverter) {
        super(descriptors, values, timeConverter);
    }

    public String getOSName() {
    	return null;
    }

    public long getOSThreadId() {
        return 0;
    }

    public RecordedThreadGroup getThreadGroup() {
        return null;
    }

    public String getJavaName() {
        return null;
    }

    public long getJavaThreadId() {
    	return 0;
    }

    public long getId() {
        return 0;
    }
}
