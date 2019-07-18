package jdk.jfr;

public @interface Category {
    /**
     * Returns the category names for this annotation, starting with the root.
     *
     * @return the category names
     */
    String[] value();
}
