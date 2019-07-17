package jdk.jfr.internal.handlers;

import jdk.jfr.EventType;
import jdk.jfr.internal.EventControl;
import jdk.jfr.internal.JVM;
import jdk.jfr.internal.PlatformEventType;
import jdk.jfr.internal.PrivateAccess;
import jdk.jfr.internal.StringPool;

public abstract class EventHandler {

	protected final PlatformEventType platformEventType;

    EventHandler(boolean registered, EventType eventType, EventControl eventControl) {
    }

    final protected StringPool createStringFieldWriter() {
        return null;
    }

    public final boolean shouldCommit(long duration) {
        return false;
    }

    public final boolean isEnabled() {
        return false;
    }

    public final EventType getEventType() {
        return null;
    }

    public final PlatformEventType getPlatformEventType() {
        return null;
    }

    public final EventControl getEventControl() {
        return null;
    }

    public static long timestamp() {
    	return 0;
    }

    public static long duration(long startTime) {
    	return 0;
    }

    @Override
    public final Object clone() throws java.lang.CloneNotSupportedException {
        return null;
    }

    public boolean isRegistered() {
        return false;
    }

    public boolean setRegistered(boolean registered) {
        return false;
    }
}
