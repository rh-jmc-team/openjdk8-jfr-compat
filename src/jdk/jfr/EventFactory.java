package jdk.jfr;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jdk.jfr.internal.EventClassBuilder;
import jdk.jfr.internal.JVMSupport;
import jdk.jfr.internal.MetadataRepository;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.Utils;

public final class EventFactory {

    private static final long REGISTERED_ID = Type.getTypeId(Registered.class);

    private final Class<? extends Event> eventClass;
    private final MethodHandle constructorHandle;
    private final List<AnnotationElement> sanitizedAnnotation;
    private final List<ValueDescriptor> sanitizedFields;

    private EventFactory(Class<? extends Event> eventClass, List<AnnotationElement> sanitizedAnnotation, List<ValueDescriptor> sanitizedFields) throws IllegalAccessException, NoSuchMethodException, SecurityException {
    }

    public static EventFactory create(List<AnnotationElement> annotationElements, List<ValueDescriptor> fields) {
    }

    public Event newEvent() {
        return null;
    }

    public EventType getEventType() {
        return null;
    }

    public void register() {
    }

    public void unregister() {
    }

}
