package jdk.jfr.internal.tool;

final class UserDataException extends Exception {
    private static final long serialVersionUID = 6656457380115167810L;
    /**
     * The error message.
     *
     * The first letter should not be capitalized, so a context can be printed prior
     * to the error message.
     *
     * @param errorMessage
     */
    public UserDataException(String errorMessage) {
        super(errorMessage);
    }
}
