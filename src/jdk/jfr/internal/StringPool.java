package jdk.jfr.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import jdk.internal.misc.Unsafe;

public final class StringPool {

    static final int MIN_LIMIT = 16;
    static final int MAX_LIMIT = 128; /* 0 MAX means disabled */

    public static long addString(String s) {
        return 0;
    }
}
