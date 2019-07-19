package jdk.jfr.consumer;

public final class RecordedThread extends RecordedObject {

    public String getOSName() {
        return null;
    }

    public long getOSThreadId() {
       return 0;
    }

    public RecordedThreadGroup getThreadGroup() {
        return null;
    }

    public String getJavaName() {
        return null;
    }

    public long getJavaThreadId() {
        return 0;
    }

    public long getId() {
        return 0;
    }
}
