package jdk.jfr.internal;

import java.util.List;
import java.util.Map;

import jdk.jfr.AnnotationElement;
import jdk.jfr.Configuration;
import jdk.jfr.EventType;
import jdk.jfr.Recording;
import jdk.jfr.SettingDescriptor;
import jdk.jfr.ValueDescriptor;

public abstract class PrivateAccess {
    public static PrivateAccess getInstance() {
        return null;
    }

    public static void setPrivateAccess(PrivateAccess pa) {
    }

    public abstract Type getType(Object o);

    public abstract Configuration newConfiguration(String name, String label, String description, String provider, Map<String,String> settings, String contents);

    public abstract EventType newEventType(PlatformEventType eventTypes);

    public abstract AnnotationElement newAnnotation(Type annotationType, List<Object> values, boolean boot);

    public abstract ValueDescriptor newValueDescriptor(String name, Type fieldType, List<AnnotationElement> annotations, int dimension, boolean constantPool, String fieldName);

    public abstract PlatformRecording getPlatformRecording(Recording r);

    public abstract PlatformEventType getPlatformEventType(EventType eventType);

    public abstract boolean isConstantPool(ValueDescriptor v);

    public abstract String getFieldName(ValueDescriptor v);

    public abstract ValueDescriptor newValueDescriptor(Class<?> type, String name);

    public abstract SettingDescriptor newSettingDescriptor(Type type, String name, String def, List<AnnotationElement> aes);

    public abstract void setAnnotations(ValueDescriptor v, List<AnnotationElement> a);

    public abstract void setAnnotations(SettingDescriptor s, List<AnnotationElement> a);

    public abstract boolean isUnsigned(ValueDescriptor v);

    public abstract PlatformRecorder getPlatformRecorder();
}
