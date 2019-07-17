package jdk.jfr.internal;

import static jdk.jfr.internal.LogLevel.DEBUG;
import static jdk.jfr.internal.LogTag.JFR_SYSTEM;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import jdk.jfr.AnnotationElement;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Period;
import jdk.jfr.StackTrace;
import jdk.jfr.Threshold;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.RequestEngine.RequestHook;
import jdk.jfr.internal.handlers.EventHandler;

public final class MetadataRepository {

    public MetadataRepository() {
    }

    public static MetadataRepository getInstance() {
        return null;
    }

    public synchronized List<EventType> getRegisteredEventTypes() {
        return null;
    }

    public synchronized EventType getEventType(Class<? extends jdk.internal.event.Event> eventClass) {
    }

    public synchronized void unregister(Class<? extends Event> eventClass) {
    }

    public synchronized EventType register(Class<? extends jdk.internal.event.Event> eventClass) {
        return null;
    }

    public synchronized EventType register(Class<? extends jdk.internal.event.Event> eventClass, List<AnnotationElement> dynamicAnnotations, List<ValueDescriptor> dynamicFields) {
        return null;
    }

    public synchronized void setSettings(List<Map<String, String>> list) {
    }

    synchronized void disableEvents() {
    }

    public synchronized List<EventControl> getEventControls() {
    	return null;
    }

    synchronized boolean isEnabled(String eventName) {
        return false;
    }

    synchronized void setStaleMetadata() {
    }

    synchronized void setOutput(String filename) {
    }

    synchronized void setUnregistered() {
    }

    public synchronized void registerMirror(Class<? extends Event> eventClass) {
    }

}
