package jdk.jfr.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import jdk.internal.org.objectweb.asm.AnnotationVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.Type;
import jdk.internal.org.objectweb.asm.commons.GeneratorAdapter;
import jdk.internal.org.objectweb.asm.commons.Method;
import jdk.jfr.AnnotationElement;
import jdk.jfr.Event;
import jdk.jfr.ValueDescriptor;

public final class EventClassBuilder {

    public EventClassBuilder(List<AnnotationElement> annotationElements, List<ValueDescriptor> fields) {
    }

    public Class<? extends Event> build() {
    	return null;
    }

}
