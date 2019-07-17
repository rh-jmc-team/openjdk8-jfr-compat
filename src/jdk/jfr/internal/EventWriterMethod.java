package jdk.jfr.internal;

import jdk.internal.org.objectweb.asm.commons.Method;
import jdk.jfr.internal.EventInstrumentation.FieldInfo;

public enum EventWriterMethod {

    BEGIN_EVENT("(" + jdk.internal.org.objectweb.asm.Type.getType(PlatformEventType.class).getDescriptor() + ")Z", "???", "beginEvent"),
    END_EVENT("()Z", "???", "endEvent"),
    PUT_BYTE("(B)V", "byte", "putByte"),
    PUT_SHORT("(S)V", "short", "putShort"),
    PUT_INT("(I)V", "int", "putInt"),
    PUT_LONG("(J)V", "long", "putLong"),
    PUT_FLOAT("(F)V", "float", "putFloat"),
    PUT_DOUBLE("(D)V", "double", "putDouble"),
    PUT_CHAR("(C)V", "char", "putChar"),
    PUT_BOOLEAN("(Z)V", "boolean", "putBoolean"),
    PUT_THREAD("(Ljava/lang/Thread;)V", Type.THREAD.getName(), "putThread"),
    PUT_CLASS("(Ljava/lang/Class;)V", Type.CLASS.getName(), "putClass"),
    PUT_STRING("(Ljava/lang/String;Ljdk/jfr/internal/StringPool;)V", Type.STRING.getName(), "putString"),
    PUT_EVENT_THREAD("()V", Type.THREAD.getName(), "putEventThread"),
    PUT_STACK_TRACE("()V", Type.TYPES_PREFIX + "StackTrace", "putStackTrace");

    EventWriterMethod(String paramSignature, String typeName, String methodName) {
    }

    public Method asASM() {
        return null;
    }

    public static EventWriterMethod lookupMethod(FieldInfo v) {
    	return null;
    }
}
