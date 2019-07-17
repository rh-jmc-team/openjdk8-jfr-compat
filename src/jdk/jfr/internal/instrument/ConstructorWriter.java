package jdk.jfr.internal.instrument;

import static jdk.internal.org.objectweb.asm.Opcodes.ACONST_NULL;
import static jdk.internal.org.objectweb.asm.Opcodes.ALOAD;
import static jdk.internal.org.objectweb.asm.Opcodes.INVOKESTATIC;
import static jdk.internal.org.objectweb.asm.Opcodes.RETURN;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

final class ConstructorWriter extends MethodVisitor {

    ConstructorWriter(Class<?> classToChange, boolean useInputParameter) {
    }

    @Override
    public void visitInsn(int opcode) {
    }

    @SuppressWarnings("deprecation")
    public void setMethodVisitor(MethodVisitor mv) {
    }
}
