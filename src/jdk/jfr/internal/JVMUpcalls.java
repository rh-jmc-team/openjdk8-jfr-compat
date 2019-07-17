package jdk.jfr.internal;

import java.lang.reflect.Modifier;

import jdk.jfr.internal.handlers.EventHandler;
import jdk.jfr.internal.instrument.JDKEvents;

final class JVMUpcalls {

	static byte[] onRetransform(long traceId, boolean dummy, Class<?> clazz, byte[] oldBytes) throws Throwable {
        return null;
    }

    static byte[] bytesForEagerInstrumentation(long traceId, boolean forceInstrumentation, Class<?> superClass, byte[] oldBytes) throws Throwable {
    	return null;
    }

    static Thread createRecorderThread(ThreadGroup systemThreadGroup, ClassLoader contextClassLoader) {
        return null;
    }
}
