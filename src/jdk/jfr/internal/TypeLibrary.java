package jdk.jfr.internal;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import jdk.jfr.AnnotationElement;
import jdk.jfr.Description;
import jdk.jfr.Label;
import jdk.jfr.MetadataDefinition;
import jdk.jfr.Name;
import jdk.jfr.SettingDescriptor;
import jdk.jfr.Timespan;
import jdk.jfr.Timestamp;
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
