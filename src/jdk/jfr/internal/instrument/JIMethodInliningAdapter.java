package jdk.jfr.internal.instrument;

import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.Type;
import jdk.internal.org.objectweb.asm.commons.LocalVariablesSorter;
import jdk.internal.org.objectweb.asm.commons.Remapper;
import jdk.internal.org.objectweb.asm.commons.RemappingMethodAdapter;

@Deprecated
final class JIMethodInliningAdapter extends RemappingMethodAdapter {

	public JIMethodInliningAdapter(LocalVariablesSorter mv, Label end, int acc, String desc, Remapper remapper) {
    }

    @Override
    public void visitInsn(int opcode) {
    }

    @Override
    public void visitMaxs(int stack, int locals) {
    }

    @Override
    protected int newLocalMapping(Type type) {
        return 0;
    }
}
