package jdk.jfr.internal.tool;

final class UserSyntaxException extends Exception {
    private static final long serialVersionUID = 3437009454344160933L;

    /**
     * The error message.
     *
     * The first letter should not be capitalized, so a context can be printed prior
     * to the error message.
     *
     * @param errorMessage
     */
    public UserSyntaxException(String message) {
        super(message);
    }
}
