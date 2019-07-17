package jdk.jfr.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import jdk.jfr.AnnotationElement;
import jdk.jfr.Event;
import jdk.jfr.SettingControl;
import jdk.jfr.ValueDescriptor;

public class Type implements Comparable<Type> {
    public static final String SUPER_TYPE_ANNOTATION = java.lang.annotation.Annotation.class.getName();
    public static final String SUPER_TYPE_SETTING = SettingControl.class.getName();
    public static final String SUPER_TYPE_EVENT = Event.class.getName();
    public static final String EVENT_NAME_PREFIX = "jdk.";
    public static final String TYPES_PREFIX = "jdk.types.";
    public static final String SETTINGS_PREFIX = "jdk.settings.";


    // Initialization of known types
    static final Type BOOLEAN = null;
    static final Type CHAR = null;
    static final Type FLOAT = null;
    static final Type DOUBLE = null;
    static final Type BYTE = null;
    static final Type SHORT = null;
    static final Type INT= null;
    static final Type LONG = null;
    static final Type CLASS = null;
    static final Type STRING = null;
    static final Type THREAD = null;
    static final Type STACK_TRACE = null;

    public Type(String javaTypeName, String superType, long typeId) {
    }

    Type(String javaTypeName, String superType, long typeId, boolean contantPool) {
    }

    Type(String javaTypeName, String superType, long typeId, boolean contantPool, Boolean simpleType) {
    }

    static boolean isDefinedByJVM(long id) {
    	return false;
    }

    public static long getTypeId(Class<?> clazz) {
        return 0;
    }

    static Collection<Type> getKnownTypes() {
        return null;
    }

    public static boolean isValidJavaIdentifier(String identifier) {
        return false;
    }

    public static boolean isValidJavaFieldType(String name) {
        return false;
    }

    public static Type getKnownType(String typeName) {
        return null;
    }

    static boolean isKnownType(Class<?> type) {
        return false;
    }

    public static Type getKnownType(Class<?> clazz) {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getLogName() {
       return null;
    }

    public List<ValueDescriptor> getFields() {
        return null;
    }

    public boolean isSimpleType() {
        return false;
    }

    public boolean isDefinedByJVM() {
    	return false;
    }

    public void add(ValueDescriptor valueDescriptor) {
    }

    void trimFields() {
    }

    void setAnnotations(List<AnnotationElement> annotations) {
    }

    public String getSuperType() {
        return null;
    }

    public long getId() {
        return 0;
    }

    public boolean isConstantPool() {
        return false;
    }

    public String getLabel() {
        return null;
    }

    public List<AnnotationElement> getAnnotationElements() {
        return null;
    }

    public <T> T getAnnotation(Class<? extends java.lang.annotation.Annotation> clazz) {
        return null;
    }

    public String getDescription() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        return false;
    }

    @Override
    public int compareTo(Type that) {
        return 0;
    }

    void log(String action, LogTag logTag, LogLevel level) {
    }

        @Override
    public String toString() {
        return null;
    }

    public void setRemove(boolean remove) {
    }

    public boolean getRemove() {
        return false;
    }

    public void setId(long id) {
    }
}
