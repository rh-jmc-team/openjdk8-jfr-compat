package jdk.jfr.internal;

import java.util.List;

import jdk.jfr.SettingDescriptor;

public final class PlatformEventType extends Type {

    PlatformEventType(String name, long id, boolean isJDK, boolean dynamicSettings) {
    	 super(name, Type.SUPER_TYPE_EVENT, id);
    }

    public void add(SettingDescriptor settingDescriptor) {
    }

    public List<SettingDescriptor> getSettings() {
        return null;
    }

    public List<SettingDescriptor> getAllSettings() {
        return null;
    }

    public void setHasStackTrace(boolean hasStackTrace) {
    }

    public void setHasDuration(boolean hasDuration) {
    }

    public void setHasCutoff(boolean hasCutoff) {
    }

    public void setCutoff(long cutoffNanos) {
    }

    public void setHasPeriod(boolean hasPeriod) {
    }

    public boolean hasStackTrace() {
    	return false;
    }

    public boolean hasDuration() {
        return false;
    }

    public boolean hasPeriod() {
        return false;
    }

    public boolean hasCutoff() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public boolean isJVM() {
        return false;
    }

    public boolean isJDK() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public void setPeriod(long periodMillis, boolean beginChunk, boolean endChunk) {
    }

    public void setStackTraceEnabled(boolean stackTraceEnabled) {
    }

    public void setThreshold(long thresholdNanos) {
    }

    public boolean isEveryChunk() {
        return false;
    }

    public boolean getStackTraceEnabled() {
        return false;
    }

    public long getThresholdTicks() {
        return 0;
    }

    public long getPeriod() {
        return 0;
    }

    public boolean hasEventHook() {
        return false;
    }

    public void setEventHook(boolean hasHook) {
    }

    public boolean isBeginChunk() {
        return false;
    }

    public boolean isEndChunk() {
        return false;
    }

    public boolean isInstrumented() {
        return false;
    }

    public void setInstrumented() {
    }

    public void markForInstrumentation(boolean markForInstrumentation) {
    }

    public boolean isMarkedForInstrumentation() {
        return false;
    }

    public boolean setRegistered(boolean registered) {
        return false;
    }

    public final boolean isRegistered() {
        return false;
    }

    public boolean isCommitable() {
        return false;
    }

    public int getStackTraceOffset() {
        return 0;
    }
}
