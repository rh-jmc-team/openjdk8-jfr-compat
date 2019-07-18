package jdk.jfr;

public @interface Timestamp {
    /**
     * The unit for the difference, measured in milliseconds, between the current
     * time and midnight, January 1, 1970 UTC.
     */
    public final static String MILLISECONDS_SINCE_EPOCH = "MILLISECONDS_SINCE_EPOCH";

    /**
     * The unit for the number of ticks that have transpired since some arbitrary
     * starting date.
     */
    public final static String TICKS = "TICKS";

    /**
     * Unit for the time stamp.
     *
     * @return time stamp unit, not {@code null}
     */
    String value() default Timestamp.MILLISECONDS_SINCE_EPOCH;
}
