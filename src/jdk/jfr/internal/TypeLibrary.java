package jdk.jfr.internal;

import java.lang.annotation.Annotation;
import java.util.List;

import jdk.jfr.AnnotationElement;
import jdk.jfr.ValueDescriptor;

public final class TypeLibrary {

    static final ValueDescriptor DURATION_FIELD = createDurationField();
    static final ValueDescriptor THREAD_FIELD = createThreadField();
    static final ValueDescriptor STACK_TRACE_FIELD = createStackTraceField();
    static final ValueDescriptor START_TIME_FIELD = createStartTimeField();

    private static ValueDescriptor createStartTimeField() {
    	return null;
    }

    private static ValueDescriptor createStackTraceField() {
    	return null;
    }

    private static ValueDescriptor createThreadField() {    
    	return null;
    }

    private static ValueDescriptor createDurationField() {
        return null;
    }

    public static TypeLibrary getInstance() {
        return null;
    }

    public List<Type> getTypes() {
        return null;
    }

    public static Type createAnnotationType(Class<? extends Annotation> a) {
        return null;
    }

    static AnnotationElement createAnnotation(Annotation annotation) {
       return null;
    }

    public static Type createType(Class<?> clazz) {
        return null;
    }

    public static Type createType(Class<?> clazz, List<AnnotationElement> dynamicAnnotations, List<ValueDescriptor> dynamicFields) {
        return null;
    }

    public boolean clearUnregistered() {
        return false;
    }

    public void addType(Type type) {
    }

    public static void addTypes(List<Type> ts) {
    }

    public void removeType(long id) {
    }
}
