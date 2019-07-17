package jdk.jfr.consumer;

import java.util.List;

import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.Type;

public final class RecordedMethod extends RecordedObject {

    static ObjectFactory<RecordedMethod> createFactory(Type type, TimeConverter timeConverter) {
        return new ObjectFactory<RecordedMethod>(type) {
            @Override
            RecordedMethod createTyped(List<ValueDescriptor> desc, long id, Object[] object) {
                return new RecordedMethod(desc, object, timeConverter);
            }
        };
    }

    private RecordedMethod(List<ValueDescriptor> descriptors, Object[] objects, TimeConverter timeConverter) {
        super(descriptors, objects, timeConverter);
    }

    public RecordedClass getType() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getDescriptor() {
        return null;
    }

    public int getModifiers() {
        return 0;
    }

    public boolean isHidden() {
        return false;
    }
}
