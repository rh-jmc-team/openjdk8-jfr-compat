package jdk.jfr.consumer;

public final class RecordedFrame extends RecordedObject {

    public boolean isJavaFrame() {
        return false;
    }

    public int getBytecodeIndex() {
        return 0;
    }

    public int getLineNumber() {
        return 0;
    }

    public String getType() {
        return null;
    }

    public RecordedMethod getMethod() {
        return null;
    }
}
