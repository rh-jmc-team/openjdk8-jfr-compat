package jdk.jfr.internal.management;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jdk.jfr.EventType;
import jdk.jfr.internal.JVMSupport;
import jdk.jfr.internal.LogLevel;
import jdk.jfr.internal.LogTag;
import jdk.jfr.internal.Logger;
import jdk.jfr.internal.MetadataRepository;
import jdk.jfr.internal.Utils;
import jdk.jfr.internal.instrument.JDKEvents;

public final class ManagementSupport {

    public static List<EventType> getEventTypes() {
    	return null;
    }

    public static long parseTimespan(String s) {
    	return 0;
    }

    public static final String formatTimespan(Duration dValue, String separation) {
    	return null;
    }

    public static void logError(String message) {
    }
}
