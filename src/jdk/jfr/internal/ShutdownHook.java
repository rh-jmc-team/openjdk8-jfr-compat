package jdk.jfr.internal;

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
