package jdk.jfr;

public @interface Description {
    /**
     * Returns a sentence or two that describes the annotated element.
     *
     * @return a description, not {@code null}
     */
    String value();
}
