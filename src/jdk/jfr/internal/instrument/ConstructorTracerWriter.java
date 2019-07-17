package jdk.jfr.internal.instrument;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.Type;

final class ConstructorTracerWriter extends ClassVisitor {

    static byte[] generateBytes(Class<?> clz, byte[] oldBytes) throws IOException {
        return null;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        return null;
    }
}
