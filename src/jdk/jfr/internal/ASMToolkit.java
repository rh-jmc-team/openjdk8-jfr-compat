package jdk.jfr.internal;

import java.util.List;

import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Type;
import jdk.internal.org.objectweb.asm.commons.Method;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.EventInstrumentation.FieldInfo;

final class ASMToolkit {

	public static void invokeSpecial(MethodVisitor methodVisitor, String className, Method m) {
    }

    public static void invokeStatic(MethodVisitor methodVisitor, String className, Method m) {
    }

    public static void invokeVirtual(MethodVisitor methodVisitor, String className, Method m) {
    }

    public static Type toType(ValueDescriptor v) {
            return null;
    }

    public static String getDescriptor(String typeName) {
    	return null;
    }

    public static String getInternalName(String className) {
    	return null;
    }

    public static Method makeWriteMethod(List<FieldInfo> fields) {
    	return null;
    }

    public static void logASM(String className, byte[] bytes) {
    }

}
