package jdk.jfr;

/*@Enabled(true)
@StackTrace(true)
@Registered(true)
*/
abstract public class Event {
    /**
     * Sole constructor, for invocation by subclass constructors, typically
     * implicit.
     */
    protected Event() {
    }

    /**
     * Starts the timing of this event.
     */
    final public void begin() {
    }

    /**
     * Ends the timing of this event.
     *
     * The {@code end} method must be invoked after the {@code begin} method.
     */
    final public void end() {
    }

    /**
     * Writes the field values, time stamp, and event duration to the Flight
     * Recorder system.
     * <p>
     * If the event starts with an invocation of the {@code begin} method, but does
     * not end with an explicit invocation of the {@code end} method, then the event
     * ends when the {@code commit} method is invoked.
     */
    final public void commit() {
    }

    /**
     * Returns {@code true} if at least one recording is running, and the
     * enabled setting for this event is set to {@code true}, otherwise
     * {@code false} is returned.
     *
     * @return {@code true} if event is enabled, {@code false} otherwise
     */
    final public boolean isEnabled() {
        return false;
    }

    /**
     * Returns {@code true} if the enabled setting for this event is set to
     * {@code true} and if the duration is within the threshold for the event,
     * {@code false} otherwise. The threshold is the minimum threshold for all
     * running recordings.
     *
     * @return {@code true} if the event can be written to the Flight Recorder
     *         system, {@code false} otherwise
     */
    final public boolean shouldCommit() {
        return false;
    }

    /**
     * Sets a field value.
     * <p>
     * Applicable only if the event is dynamically defined using the
     * {@code EventFactory} class.
     * <p>
     * The supplied {@code index} corresponds to the index of the
     * {@link ValueDescriptor} object passed to the factory method of the
     * {@code EventFactory} class.
     *
     * @param index the index of the field that is passed to
     *        {@code EventFactory#create(String, java.util.List, java.util.List)}
     * @param value value to set, can be {@code null}
     * @throws UnsupportedOperationException if it's not a dynamically generated
     *         event
     * @throws IndexOutOfBoundsException if {@code index} is less than {@code 0} or
     *         greater than or equal to the number of fields specified for the event
     *
     * @see EventType#getFields()
     * @see EventFactory
     */
    final public void set(int index, Object value) {
    }
}


