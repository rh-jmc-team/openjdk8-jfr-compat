package jdk.jfr;

import java.lang.annotation.Annotation;
import java.util.List;

import jdk.jfr.internal.PlatformEventType;
import jdk.jfr.internal.Type;

public final class EventType {
	EventType(PlatformEventType platformEventType) {
	}

    public List<ValueDescriptor> getFields() {
        return null;
    }

    public ValueDescriptor getField(String name) {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getLabel() {
        return null;
    }

    public long getId() {
        return 0;
    }

    public List<AnnotationElement> getAnnotationElements() {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    public String getDescription() {
        return null;
    }

    public <A extends Annotation> A getAnnotation(Class<A> annotationClass) {
       return null;
    }

    public static EventType getEventType(Class<? extends Event> eventClass) {
       return null;
    }

    public List<SettingDescriptor> getSettingDescriptors() {
        return null;
    }

    public List<String> getCategoryNames() {
    	return null;
    }

    Type getType() {
        return null;
    }

    PlatformEventType getPlatformEventType() {
        return null;
    }
}
