package jdk.jfr.internal;

import java.io.IOException;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

import jdk.jfr.RecordingState;

final class ShutdownHook implements Runnable {
    Object tlabDummyObject;

    ShutdownHook(PlatformRecorder recorder) {
    }

    @Override
    public void run() {
    }

    static final class ExceptionHandler implements Thread.UncaughtExceptionHandler {
        public void uncaughtException(Thread t, Throwable e) {
        }
    }
}
