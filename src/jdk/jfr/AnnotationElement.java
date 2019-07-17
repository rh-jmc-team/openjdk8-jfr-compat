package jdk.jfr;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

import jdk.jfr.internal.Type;

public final class AnnotationElement {

    // package private
    AnnotationElement(Type type, List<Object> objects, boolean boot) {
    }

 
    public AnnotationElement(Class<? extends Annotation> annotationType, Map<String, Object> values) {
    }

    public AnnotationElement(Class<? extends Annotation> annotationType, Object value) {
    }

    public AnnotationElement(Class<? extends Annotation> annotationType) {
    }

    public List<Object> getValues() {
    	return null;
    }

    public List<ValueDescriptor> getValueDescriptors() {
        return null;
    }

    public List<AnnotationElement> getAnnotationElements() {
    	return null;
    }

    public String getTypeName() {
        return null;
    }

    public Object getValue(String name) {
       return null;
    }

    public boolean hasValue(String name) {
        return false;
    }

    public final <A> A getAnnotation(Class<? extends Annotation> annotationType) {
        return null;
    }

    public long getTypeId() {
        return 0;
    }

    Type getType() {
        return null;
    }

    boolean isInBoot() {
        return false;
    }

}
