package jdk.jfr.consumer;

import java.util.List;

import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.Type;

public final class RecordedClass extends RecordedObject {

    static ObjectFactory<RecordedClass> createFactory(Type type, TimeConverter timeConverter) {
        return new ObjectFactory<RecordedClass>(type) {
            @Override
            RecordedClass createTyped(List<ValueDescriptor> desc, long id, Object[] object) {
                return new RecordedClass(desc, id, object, timeConverter);
            }
        };
    }

    private RecordedClass(List<ValueDescriptor> descriptors, long id, Object[] values, TimeConverter timeConverter) {
        super(descriptors, values, timeConverter);
    }

    public int getModifiers() {
        return 0;
    }

    public RecordedClassLoader getClassLoader() {
        return null;
    }

    public String getName() {
        return null;
    }

    public long getId() {
        return 0;
    }
}
