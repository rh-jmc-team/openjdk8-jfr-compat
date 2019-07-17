package jdk.jfr.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

import jdk.jfr.AnnotationElement;
import jdk.jfr.Description;
import jdk.jfr.Label;
import jdk.jfr.Unsigned;

public final class AnnotationConstruct {

    private static final class AnnotationInvokationHandler implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        	return null;
        }
    }

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

    @SuppressWarnings("unchecked")
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
