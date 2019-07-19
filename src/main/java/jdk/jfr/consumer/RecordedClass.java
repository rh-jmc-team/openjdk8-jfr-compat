package jdk.jfr.consumer;

import jdk.jfr.ValueDescriptor;


public final class RecordedClass extends RecordedObject {

        public int getModifiers() {
        	return 0;
    }

    public RecordedClassLoader getClassLoader() {
        return null;
    }

    public String getName() {
        return null;
    }

    public long getId() {
        return 0;
    }
}
