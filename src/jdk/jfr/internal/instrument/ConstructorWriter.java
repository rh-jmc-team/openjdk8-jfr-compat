package jdk.jfr.internal.instrument;

import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

final class ConstructorWriter extends MethodVisitor {

    ConstructorWriter(Class<?> classToChange, boolean useInputParameter) {
    	super(Opcodes.ASM5);
    }

    @Override
    public void visitInsn(int opcode) {
    }

    public void setMethodVisitor(MethodVisitor mv) {
    }
}
