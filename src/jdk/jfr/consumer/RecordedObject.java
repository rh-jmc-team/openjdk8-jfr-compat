package jdk.jfr.consumer;

import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.List;

import jdk.jfr.ValueDescriptor;

public class RecordedObject {

    RecordedObject(List<ValueDescriptor> descriptors, Object[] objects, TimeConverter timeConverter) {
    }

    final <T> T getTyped(String name, Class<T> clazz, T defaultValue) {
    	return null;
    }

    public boolean hasField(String name) {
        return false;
    }

    final public <T> T getValue(String name) {
        return null;
    }

    public List<ValueDescriptor> getFields() {
        return null;
    }

    public final boolean getBoolean(String name) {
    	return false;
    }

    public final byte getByte(String name) {
    	return 0;
    }

    public final char getChar(String name) {
    	return 0;
    }

    public final short getShort(String name) {
    	return 0;
    }

    public final int getInt(String name) {
    	return 0;
    }

    public final float getFloat(String name) {
    	return 0;
    }

    public final long getLong(String name) {
    	return 0;
    }

    public final double getDouble(String name) {
    	return 0;
    }

    public final String getString(String name) {
        return null;
    }

    public final Duration getDuration(String name) {
    	return null;
    }

    public final Instant getInstant(String name) {
    	return null;
    }

    public final RecordedClass getClass(String name) {
        return null;
    }

    public final RecordedThread getThread(String name) {
        return null;
    }

    @Override
    final public String toString() {
        return null;
    }

    OffsetDateTime getOffsetDateTime(String name) {
        return null;
    }

}
