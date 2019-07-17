package jdk.jfr.internal.instrument;

import java.util.ArrayList;
import java.util.List;

import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.commons.LocalVariablesSorter;
import jdk.internal.org.objectweb.asm.commons.Remapper;
import jdk.internal.org.objectweb.asm.commons.SimpleRemapper;
import jdk.internal.org.objectweb.asm.tree.MethodNode;
import jdk.jfr.internal.LogLevel;
import jdk.jfr.internal.LogTag;
import jdk.jfr.internal.Logger;

@Deprecated
final class JIMethodCallInliner extends LocalVariablesSorter {

    public JIMethodCallInliner(int access, String desc, MethodVisitor mv,
            MethodNode inlineTarget, String oldClass, String newClass) {
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name,
    }

    @Override
    public void visitTryCatchBlock(Label start, Label end, Label handler,
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
        }
    }
}
