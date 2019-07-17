package jdk.jfr.internal;

import jdk.jfr.internal.SecuritySupport.SafePath;

public final class Options {

    public static synchronized void setMaxChunkSize(long max) {
    }

    public static synchronized long getMaxChunkSize() {
        return 0;
    }

    public static synchronized void setMemorySize(long memSize) {
    }

    public static synchronized long getMemorySize() {
        return 0;
    }

    public static synchronized void setThreadBufferSize(long threadBufSize) {
    }

    public static synchronized long getThreadBufferSize() {
        return 0;
    }

    public static synchronized long getGlobalBufferSize() {
        return 0;
    }

    public static synchronized void setGlobalBufferCount(long globalBufCount) {
    }

    public static synchronized long getGlobalBufferCount() {
        return 0;
    }

    public static synchronized void setGlobalBufferSize(long globalBufsize) {
    }

    public static synchronized void setDumpPath(SafePath path) {
    }

    public static synchronized SafePath getDumpPath() {
        return null;
    }

    public static synchronized void setStackDepth(Integer stackTraceDepth) {
    }

    public static synchronized int getStackDepth() {
        return 0;
    }

    public static synchronized void setSampleThreads(Boolean sample) {
    }

    public static synchronized boolean getSampleThreads() {
        return false;
    }

    static synchronized long getWaitInterval() {
        return 0;
    }

    static void ensureInitialized() {
    }

}
