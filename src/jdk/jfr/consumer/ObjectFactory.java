package jdk.jfr.consumer;

import java.util.List;

import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.Type;

abstract class ObjectFactory<T> {

    final static String TYPE_PREFIX_VERSION_1 = "com.oracle.jfr.types.";
    final static String TYPE_PREFIX_VERSION_2 = Type.TYPES_PREFIX;
    final static String STACK_FRAME_VERSION_1 = TYPE_PREFIX_VERSION_1 + "StackFrame";
    final static String STACK_FRAME_VERSION_2 = TYPE_PREFIX_VERSION_2 + "StackFrame";

    public static ObjectFactory<?> create(Type type, TimeConverter timeConverter) {
        return null;
    }

    ObjectFactory(Type type) {
    }

    T createObject(long id, Object value) {
    	return null;
    }

    abstract T createTyped(List<ValueDescriptor> valueDescriptors, long id, Object[] values);
}
