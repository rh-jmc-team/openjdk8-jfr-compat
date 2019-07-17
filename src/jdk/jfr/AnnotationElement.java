package jdk.jfr;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;

import jdk.jfr.internal.Type;
import jdk.jfr.internal.TypeLibrary;
import jdk.jfr.internal.Utils;

public final class AnnotationElement {
    private final Type type;
    private final List<Object> annotationValues;
    private final List<String> annotationNames;
    private final boolean inBootClassLoader;

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
    }

    public List<ValueDescriptor> getValueDescriptors() {
        return null;
    }

    public List<AnnotationElement> getAnnotationElements() {
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

    // package private
    Type getType() {
        return null;
    }

    private static void checkType(Class<?> type) {
    }

    private static boolean isKnownJFRAnnotation(Class<? extends Annotation> annotationType) {
        return false;
    }

    boolean isInBoot() {
        return false;
    }

}
