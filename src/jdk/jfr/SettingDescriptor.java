package jdk.jfr;

import java.lang.annotation.Annotation;
import java.util.List;

import jdk.jfr.internal.Type;

public final class SettingDescriptor {

    // package private, invoked by jdk.internal.
    SettingDescriptor(Type type, String name, String defaultValue, List<AnnotationElement> annotations) {
    }

    // package private
    void setAnnotations(List<AnnotationElement> as) {
    }

    public String getName() {
        return null;
    }

    public String getLabel() {
    	return null;
    }

    public String getDescription() {
    	return null;
    }

    public String getContentType() {
        return null;
    }

    public String getTypeName() {
        return null;
    }

    public long getTypeId() {
        return 0;
    }

    public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
    	return null;
    }

    public List<AnnotationElement> getAnnotationElements() {
        return null;
    }

    public String getDefaultValue() {
        return null;
    }

    Type getType() {
        return null;
    }
}
