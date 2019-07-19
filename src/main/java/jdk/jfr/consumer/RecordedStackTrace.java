package jdk.jfr.consumer;

import java.util.List;

public final class RecordedStackTrace extends RecordedObject {

    @SuppressWarnings("unchecked")
    public List<RecordedFrame> getFrames() {
        return null;
    }

    public boolean isTruncated() {
        return false;
    }
}
