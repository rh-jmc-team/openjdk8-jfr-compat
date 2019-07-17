package jdk.jfr.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import jdk.internal.module.Modules;
import jdk.jfr.AnnotationElement;
import jdk.jfr.Enabled;
import jdk.jfr.Name;
import jdk.jfr.Period;
import jdk.jfr.SettingControl;
import jdk.jfr.SettingDefinition;
import jdk.jfr.StackTrace;
import jdk.jfr.Threshold;
import jdk.jfr.events.ActiveSettingEvent;
import jdk.jfr.internal.EventInstrumentation.SettingInfo;
import jdk.jfr.internal.settings.CutoffSetting;
import jdk.jfr.internal.settings.EnabledSetting;
import jdk.jfr.internal.settings.PeriodSetting;
import jdk.jfr.internal.settings.StackTraceSetting;
import jdk.jfr.internal.settings.ThresholdSetting;

public final class EventControl {

    static final String FIELD_SETTING_PREFIX = "setting";

    EventControl(PlatformEventType eventType) {
    }

    static void remove(PlatformEventType type, List<AnnotationElement> aes, Class<? extends java.lang.annotation.Annotation> clazz) {
    }

    EventControl(PlatformEventType es, Class<? extends jdk.internal.event.Event> eventClass) {
    }

    @SuppressWarnings("unchecked")
    void disable() {
    }

    void writeActiveSettingEvent() {
    }

    public Set<Entry<String, Control>> getEntries() {
        return null;
    }

    public PlatformEventType getEventType() {
        return null;
    }

    public String getSettingsId() {
        return null;
    }

    public List<SettingInfo> getSettingInfos() {
        return null;
    }
}
