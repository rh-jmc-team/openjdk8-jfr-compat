package jdk.jfr.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ReflectPermission;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PropertyPermission;
import java.util.concurrent.Callable;

import jdk.internal.misc.Unsafe;
import jdk.internal.module.Modules;
import jdk.jfr.Event;
import jdk.jfr.FlightRecorder;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.FlightRecorderPermission;
import jdk.jfr.Recording;

/**
 * Contains JFR code that does
 * {@link AccessController#doPrivileged(PrivilegedAction)}
 */
public final class SecuritySupport {
    public  final static SafePath JFC_DIRECTORY = getPathInProperty("java.home", "lib/jfr");

    static final SafePath USER_HOME = getPathInProperty("user.home", null);
    static final SafePath JAVA_IO_TMPDIR = getPathInProperty("java.io.tmpdir", null);

    final static class SecureRecorderListener implements FlightRecorderListener {

        SecureRecorderListener(AccessControlContext context, FlightRecorderListener changeListener) {
        }

        @Override
        public void recordingStateChanged(Recording recording) {
        }

        @Override
        public void recorderInitialized(FlightRecorder recorder) {
        }

        public FlightRecorderListener getChangeListener() {
        	return null;
        }
    }

    public static final class SafePath {
    	public SafePath(Path p) {
        }

        public SafePath(String path) {
        }

        public Path toPath() {
            return null;
        }

        public String toString() {
            return null;
        }
    }

    private interface RunnableWithCheckedException {
        public void run() throws Exception;
    }

    private interface CallableWithoutCheckException<T> {
        public T call();
    }

    public static List<SafePath> getPredefinedJFCFiles() {

    }

    static void makeVisibleToJFR(Class<?> clazz) {
    }

    static void addHandlerExport(Class<?> clazz) {
    }

    static void addEventsExport(Class<?> clazz) {
    }

    static void addInstrumentExport(Class<?> clazz) {
    }

    static void addReadEdge(Class<?> clazz) {
    }

    public static void registerEvent(Class<? extends jdk.internal.event.Event> eventClass) {
    }

    public static void registerMirror(Class<? extends Event> eventClass) {
    }

    static boolean getBooleanProperty(String propertyName) {
    	return false;
    }

    static Thread createRecorderThread(ThreadGroup systemThreadGroup, ClassLoader contextClassLoader) {
    	return null;
    }

    static void registerShutdownHook(Thread shutdownHook) {
    }

    static void setUncaughtExceptionHandler(Thread thread, Thread.UncaughtExceptionHandler eh) {
    }

    static void moveReplace(SafePath from, SafePath to) throws IOException {
    }

    static void clearDirectory(SafePath safePath) throws IOException {
    }

    static SafePath toRealPath(SafePath safePath) throws Exception {
    	return null;
    }

    static boolean existDirectory(SafePath directory) throws IOException {
        return false;
    }

    static RandomAccessFile createRandomAccessFile(SafePath path) throws Exception {
        return null;
    }

    public static InputStream newFileInputStream(SafePath safePath) throws IOException {
        return null;
    }

    public static long getFileSize(SafePath safePath) throws IOException {
        return 0;
    }

    static SafePath createDirectories(SafePath safePath) throws IOException {
        return null;
    }

    public static boolean exists(SafePath safePath) throws IOException {
        return false;
    }

    public static boolean isDirectory(SafePath safePath) throws IOException {
        return false;
    }

    static void delete(SafePath localPath) throws IOException {
    }

    static boolean isWritable(SafePath safePath) throws IOException {
        return false;
    }

    static void deleteOnExit(SafePath safePath) {
    }

    static ReadableByteChannel newFileChannelToRead(SafePath safePath) throws IOException {
        return null;
    }

    public static InputStream getResourceAsStream(String name) throws IOException {
        return null;
    }

    public static Reader newFileReader(SafePath safePath) throws FileNotFoundException, IOException {
        return null;
    }

    static void touch(SafePath path) throws IOException {
    }

    static void setAccessible(Method method) {
    }

    static void setAccessible(Field field) {
    }

    static void setAccessible(Constructor<?> constructor) {
    }

    static void ensureClassIsInitialized(Class<?> clazz) {
    }

    static Class<?> defineClass(Class<?> lookupClass, byte[] bytes) {
    	return null;
    }

    static Thread createThreadWitNoPermissions(String threadName, Runnable runnable) {
        return null;
    }

    static void setDaemonThread(Thread t, boolean daeomn) {
    }

    public static SafePath getAbsolutePath(SafePath path) throws IOException {
        return null;
    }
}
