package jdk.jfr.consumer;

import java.util.List;

import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.Type;

public final class RecordedThreadGroup extends RecordedObject {

    static ObjectFactory<RecordedThreadGroup> createFactory(Type type, TimeConverter timeConverter) {
        return new ObjectFactory<RecordedThreadGroup>(type) {
            @Override
            RecordedThreadGroup createTyped(List<ValueDescriptor> desc, long id, Object[] object) {
                return new RecordedThreadGroup(desc, object, timeConverter);
            }
        };
    }

    private RecordedThreadGroup(List<ValueDescriptor> descriptors, Object[] objects, TimeConverter timeConverter) {
        super(descriptors, objects, timeConverter);
    }

    public String getName() {
        return null;
    }

    public RecordedThreadGroup getParent() {
        return null;
    }
}
