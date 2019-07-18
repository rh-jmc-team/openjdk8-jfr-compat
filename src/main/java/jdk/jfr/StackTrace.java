package jdk.jfr;

public @interface StackTrace {
    public final static String NAME = "stackTrace";

    boolean value() default true;
}
