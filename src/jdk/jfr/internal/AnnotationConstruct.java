package jdk.jfr.internal;

import java.lang.annotation.Annotation;
import java.util.List;

import jdk.jfr.AnnotationElement;

public final class AnnotationConstruct {

    public AnnotationConstruct(List<AnnotationElement> ann) {
    }

    public AnnotationConstruct() {
    }

    public void setAnnotationElements(List<AnnotationElement> elements) {
    }

    public String getLabel() {
    	return null;
    }

    public String getDescription() {
        return null;
    }

    public final <T> T getAnnotation(Class<? extends Annotation> clazz) {
        return null;
    }

    public List<AnnotationElement> getUnmodifiableAnnotationElements() {
        return null;
    }

    // package private
    boolean remove(AnnotationElement annotation) {
        return false;
    }

    public boolean hasUnsigned() {
        return false;
    }
}
