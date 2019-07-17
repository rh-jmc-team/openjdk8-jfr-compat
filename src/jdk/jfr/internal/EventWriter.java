package jdk.jfr.internal;

import jdk.internal.misc.Unsafe;
import jdk.jfr.internal.consumer.RecordingInput;

public final class EventWriter {

	boolean notified;

    public static EventWriter getEventWriter() {
        return null;
    }

    public void putBoolean(boolean i) {
    }

    public void putByte(byte i) {
    }

    public void putChar(char v) {
    }

    public void putShort(short v) {
    }

    public void putInt(int v) {
    }

    public void putFloat(float i) {
    }

    public void putLong(long v) {
    }

    public void putDouble(double i) {
    }

    public void putString(String s, StringPool pool) {
    }

    public void putEventThread() {
    }

    public void putThread(Thread athread) {
    }

    public void putClass(Class<?> aClass) {
    }

    public void putStackTrace() {
    }

    public boolean beginEvent(PlatformEventType eventType) {
    	return false;
    }

    public boolean endEvent() {
        return false;
    }

}
