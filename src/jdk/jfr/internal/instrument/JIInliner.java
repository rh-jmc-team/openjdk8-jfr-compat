package jdk.jfr.internal.instrument;

import java.lang.reflect.Method;
import java.util.List;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;

@Deprecated
final class JIInliner extends ClassVisitor {

	JIInliner(int api, ClassVisitor cv, String targetClassName, String instrumentationClassName,
            ClassReader targetClassReader,
            List<Method> instrumentationMethods) {
        super(api, cv);
	}

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        return null;
    }

}
