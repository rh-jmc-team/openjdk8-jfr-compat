package jdk.jfr.internal;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import jdk.jfr.Event;
import jdk.jfr.EventType;

public final class RequestEngine {

    final static class RequestHook {
       RequestHook(PlatformEventType eventType) {
       }
    }

    public static void addHook(AccessControlContext acc, PlatformEventType type, Runnable hook) {
    }

    public static void addTrustedJDKHook(Class<? extends Event> eventClass, Runnable runnable) {
    }

    public static boolean removeHook(Runnable hook) {
        return false;
    }

    static void addHooks(List<RequestHook> newEntries) {
    }

    static void doChunkEnd() {
    }

    static void doChunkBegin() {
    }

    static long doPeriodic() {
        return 0;
    }

}
