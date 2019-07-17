package jdk.jfr;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import jdk.jfr.internal.PlatformEventType;
import jdk.jfr.internal.PlatformRecorder;
import jdk.jfr.internal.PlatformRecording;
import jdk.jfr.internal.PrivateAccess;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.Utils;

@SuppressWarnings("serial")
public final class FlightRecorderPermission extends java.security.BasicPermission {

    private final static class InternalAccess extends PrivateAccess {

        @Override
        public Type getType(Object o) {
        	return null;
        }

        @Override
        public Configuration newConfiguration(String name, String label, String description, String provider, Map<String, String> settings, String contents) {
            return null;
        }

        @Override
        public EventType newEventType(PlatformEventType platformEventType) {
            return null;
        }

        @Override
        public AnnotationElement newAnnotation(Type annotationType, List<Object> values, boolean boot) {
            return null;
        }

        @Override
        public ValueDescriptor newValueDescriptor(String name, Type fieldType, List<AnnotationElement> annos, int dimension, boolean constantPool, String fieldName) {
            return null;
        }

        @Override
        public PlatformRecording getPlatformRecording(Recording r) {
            return null;
        }

        @Override
        public PlatformEventType getPlatformEventType(EventType eventType) {
            return null;
        }

        @Override
        public boolean isConstantPool(ValueDescriptor v) {
            return false;
        }

        @Override
        public void setAnnotations(ValueDescriptor v, List<AnnotationElement> a) {
        }

        @Override
        public void setAnnotations(SettingDescriptor s, List<AnnotationElement> a) {
        }

        @Override
        public String getFieldName(ValueDescriptor v) {
            return null;
        }

        @Override
        public ValueDescriptor newValueDescriptor(Class<?> type, String name) {
            return null;
        }

        @Override
        public SettingDescriptor newSettingDescriptor(Type type, String name, String defaultValue, List<AnnotationElement> annotations) {
            return null;
        }

        @Override
        public boolean isUnsigned(ValueDescriptor v) {
            return false;
        }

        @Override
        public PlatformRecorder getPlatformRecorder() {
            return null;
        }
    }

    public FlightRecorderPermission(String name) {
    }
}
