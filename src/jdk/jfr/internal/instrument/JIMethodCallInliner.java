package jdk.jfr.internal.instrument;

import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.commons.LocalVariablesSorter;
import jdk.internal.org.objectweb.asm.tree.MethodNode;

@Deprecated
final class JIMethodCallInliner extends LocalVariablesSorter {

    public JIMethodCallInliner(int access, String desc, MethodVisitor mv,
            MethodNode inlineTarget, String oldClass, String newClass) {
        super(Opcodes.ASM5, access, desc, mv);

    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name,
    		String desc, boolean itf) {
    }

    @Override
    public void visitTryCatchBlock(Label start, Label end, Label handler,
    		 String type) {
    }

    @Override
    public void visitMaxs(int stack, int locals) {
    }

    static final class CatchBlock {

        final Label start;
        final Label end;
        final Label handler;
        final String type;

        CatchBlock(Label start, Label end, Label handler, String type) {
        	this.start = null;
            this.end = null;
            this.handler = null;
            this.type = null;
        }
    }
}
