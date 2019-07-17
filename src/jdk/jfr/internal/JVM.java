package jdk.jfr.internal;

import java.io.IOException;
import java.util.List;

import jdk.internal.HotSpotIntrinsicCandidate;
import jdk.jfr.Event;

public final class JVM {
    static final Object FILE_DELTA_CHANGE = new Object();

    static final long RESERVED_CLASS_ID_LIMIT = 400;

    public static JVM getJVM() {
        return null;
    }

    public native void beginRecording();

    @HotSpotIntrinsicCandidate
    public static native long counterTime();

    public native boolean emitEvent(long eventTypeId, long timestamp, long when);

    public native void endRecording();

    public native List<Class<? extends jdk.internal.event.Event>> getAllEventClasses();

    public native long getUnloadedEventClassCount();

    @HotSpotIntrinsicCandidate
    public static native long getClassId(Class<?> clazz);

    public static native long getClassIdNonIntrinsic(Class<?> clazz);

    public native String getPid();

    public native long getStackTraceId(int skipCount);

    public native long getThreadId(Thread t);

    public native long getTicksFrequency();

    public static native void log(int tagSetId, int level, String message);

    public static native void subscribeLogLevel(LogTag lt, int tagSetId);

    public native synchronized void retransformClasses(Class<?>[] classes);

    public native void setEnabled(long eventTypeId, boolean enabled);
    
    public native void setFileNotification(long delta);

    public native void setGlobalBufferCount(long count) throws IllegalArgumentException, IllegalStateException;

    public native void setGlobalBufferSize(long size) throws IllegalArgumentException;

    public native void setMemorySize(long size) throws IllegalArgumentException;

    public native void setMethodSamplingInterval(long type, long intervalMillis);

    public native void setOutput(String file);

    public native void setForceInstrumentation(boolean force);

    public native void setSampleThreads(boolean sampleThreads) throws IllegalStateException;

    public native void setCompressedIntegers(boolean compressed) throws IllegalStateException;

    public native void setStackDepth(int depth) throws IllegalArgumentException, IllegalStateException;

    public native void setStackTraceEnabled(long eventTypeId, boolean enabled);

    public native void setThreadBufferSize(long size) throws IllegalArgumentException, IllegalStateException;

    public native boolean setThreshold(long eventTypeId, long ticks);

    public native void storeMetadataDescriptor(byte[] bytes);

    public void endRecording_() {
    }

    public void beginRecording_() {
    }

    public boolean isRecording() {
        return false;
    }

    public native boolean getAllowedToDoEventRetransforms();

    public boolean createFailedNativeJFR() throws IllegalStateException {
        return false;
    }

    public void createNativeJFR() {
    }

    public boolean destroyNativeJFR() {
    	return false;
    }

    public boolean hasNativeJFR() {
        return false;
    }

    public native boolean isAvailable();

    public native double getTimeConversionFactor();

    public native long getTypeId(Class<?> clazz);

    @HotSpotIntrinsicCandidate
    public static native Object getEventWriter();

    public static native EventWriter newEventWriter();

    public static native boolean flush(EventWriter writer, int uncommittedSize, int requestedSize);

    public native void setRepositoryLocation(String dirText);

    public native void abort(String errorMsg);

    public static native boolean addStringConstant(boolean epoch, long id, String s);

    public native long getEpochAddress();

    public native void uncaughtException(Thread thread, Throwable t);

    public native boolean setCutoff(long eventTypeId, long cutoffTicks);

    public native void emitOldObjectSamples(long cutoff, boolean emitAll);

    public native boolean shouldRotateDisk();
}
