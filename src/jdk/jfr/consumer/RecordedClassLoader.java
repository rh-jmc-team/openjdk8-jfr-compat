package jdk.jfr.consumer;

import java.util.List;

import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.Type;

public final class RecordedClassLoader extends RecordedObject {

    static ObjectFactory<RecordedClassLoader> createFactory(Type type, TimeConverter timeConverter) {
        return new ObjectFactory<RecordedClassLoader>(type) {
            @Override
            RecordedClassLoader createTyped(List<ValueDescriptor> desc, long id, Object[] object) {
                return new RecordedClassLoader(desc, id, object, timeConverter);
            }
        };
    }
    
    private RecordedClassLoader(List<ValueDescriptor> descriptors, long id, Object[] values, TimeConverter timeConverter) {
        super(descriptors, values, timeConverter);
    }

    public RecordedClass getType() {
        return null;
    }

    public String getName() {
        return null;
    }

    public long getId() {
        return 0;
    }
}
