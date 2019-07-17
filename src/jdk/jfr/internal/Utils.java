package jdk.jfr.internal;

import static java.util.concurrent.TimeUnit.MICROSECONDS;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.util.CheckClassAdapter;
import jdk.jfr.Event;
import jdk.jfr.FlightRecorderPermission;
import jdk.jfr.Recording;
import jdk.jfr.RecordingState;
import jdk.jfr.internal.handlers.EventHandler;
import jdk.jfr.internal.settings.PeriodSetting;
import jdk.jfr.internal.settings.StackTraceSetting;
import jdk.jfr.internal.settings.ThresholdSetting;

public final class Utils {

    public static final String EVENTS_PACKAGE_NAME = "jdk.jfr.events";
    public static final String INSTRUMENT_PACKAGE_NAME = "jdk.jfr.internal.instrument";
    public static final String HANDLERS_PACKAGE_NAME = "jdk.jfr.internal.handlers";
    public static final String REGISTER_EVENT = "registerEvent";
    public static final String ACCESS_FLIGHT_RECORDER = "accessFlightRecorder";

    public static void checkAccessFlightRecorder() throws SecurityException {
    }

    public static void checkRegisterPermission() throws SecurityException {
    }

    public static String formatBytesCompact(long bytes) {
    	return null;
    }

    public static String formatBits(long bits) {
    	return null;
    }

    public static String formatBytes(long bytes) {
    	return null;
    }

    public static String formatBytesPerSecond(long bytes) {
    	return null;
    }

    public static String formatBitsPerSecond(long bits) {
    	return null;
    }
    public static String formatTimespan(Duration dValue, String separation) {
    	return null;
    }

    public static long parseTimespanWithInfinity(String s) {
    	return 0;
    }

    public static long parseTimespan(String s) {
    }

    static List<Annotation> getAnnotations(Class<?> clazz) {
        return null;
    }

    static boolean isAfter(RecordingState stateToTest, RecordingState b) {
        return false;
    }

    static boolean isBefore(RecordingState stateToTest, RecordingState b) {
        return false;
    }

    static boolean isState(RecordingState stateToTest, RecordingState... states) {
        return false;
    }

    public static void touch(Path dumpFile) throws IOException {
    }

    public static Class<?> unboxType(Class<?> t) {
        return null;
    }

    static long nanosToTicks(long nanos) {
        return 0;
    }

    static synchronized EventHandler getHandler(Class<? extends jdk.internal.event.Event> eventClass) {
        return null;
    }

    static synchronized void setHandler(Class<? extends jdk.internal.event.Event> eventClass, EventHandler handler) {
    }

    public static Map<String, String> sanitizeNullFreeStringMap(Map<String, String> settings) {
        return null;
    }

    public static <T> List<T> sanitizeNullFreeList(List<T> elements, Class<T> clazz) {
        return null;
    }

    static List<Field> getVisibleEventFields(Class<?> clazz) {
        return null;
    }

    public static void ensureValidEventSubclass(Class<?> eventClass) {
    }

    public static void writeGeneratedASM(String className, byte[] bytes) {
    }

    public static void ensureInitialized(Class<? extends jdk.internal.event.Event> eventClass) {
    }

    public static Object makePrimitiveArray(String typeName, List<Object> values) {
        return null;
    }

    public static boolean isSettingVisible(Control c, boolean hasEventHook) {
        return false;
    }

    public static boolean isSettingVisible(long typeId, boolean hasEventHook) {
        return false;
    }

    public static Type getValidType(Class<?> type, String name) {
        return null;
    }

    public static <T> List<T> smallUnmodifiable(List<T> list) {
        return null;
    }

    public static String upgradeLegacyJDKEvent(String eventName) {
        return null;
    }

    public static void verifyMirror(Class<?> mirror, Class<?> real) {
    }

    public static String makeFilename(Recording recording) {
        return null;
    }
}
