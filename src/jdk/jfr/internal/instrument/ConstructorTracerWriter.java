package jdk.jfr.internal.instrument;

import java.io.IOException;

import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

final class ConstructorTracerWriter extends ClassVisitor {

    static byte[] generateBytes(Class<?> clz, byte[] oldBytes) throws IOException {
        return null;
    }
    private ConstructorTracerWriter(ClassVisitor cv, Class<?> classToChange) {
        super(Opcodes.ASM5, cv);
    }
    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        return null;
    }
}
