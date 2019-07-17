package jdk.jfr;

public @interface Label {
    /**
     * Returns a human-readable name for the annotated element.
     *
     * @return a human-readable name, not {@code null}
     */
    String value();
}

