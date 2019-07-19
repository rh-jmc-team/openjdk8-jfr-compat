package jdk.jfr;

public @interface DataAmount {
    /**
     * Unit for bits
     */
    public static final String BITS = "BITS";
    /**
     * Unit for bytes
     */
    public static final String BYTES = "BYTES";

    /**
     * Returns the unit for the data amount, by default bytes.
     *
     * @return the data amount unit, default {@code BYTES}, not {@code null}
     */
    String value() default BYTES;
}
