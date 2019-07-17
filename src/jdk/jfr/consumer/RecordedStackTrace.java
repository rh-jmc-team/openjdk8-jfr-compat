package jdk.jfr.consumer;

import java.util.List;

import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.Type;

public final class RecordedStackTrace extends RecordedObject {

    static ObjectFactory<RecordedStackTrace> createFactory(Type type, TimeConverter timeConverter) {
        return new ObjectFactory<RecordedStackTrace>(type) {
            @Override
            RecordedStackTrace createTyped(List<ValueDescriptor> desc, long id, Object[] object) {
                return new RecordedStackTrace(desc, object, timeConverter);
            }
        };
    }

    private RecordedStackTrace(List<ValueDescriptor> desc, Object[] values, TimeConverter timeConverter) {
        super(desc, values, timeConverter);
    }

    public List<RecordedFrame> getFrames() {
        return null;
    }

    public boolean isTruncated() {
        return false;
    }
}
