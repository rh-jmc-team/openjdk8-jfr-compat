package jdk.jfr.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.Type;
import jdk.internal.org.objectweb.asm.commons.Method;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.SettingControl;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.EventInstrumentation.FieldInfo;
import jdk.jfr.internal.EventInstrumentation.SettingInfo;
import jdk.jfr.internal.handlers.EventHandler;

final class EventHandlerCreator {

	public EventHandlerCreator(long id, List<SettingInfo> settingInfos, List<FieldInfo> fields) {
    }

    public static String makeEventHandlerName(long id) {
        return null;
    }

    public EventHandlerCreator(long id, List<SettingInfo> settingInfos, EventType type, Class<? extends jdk.internal.event.Event> eventClass) {
    }

    public Class<? extends EventHandler> makeEventHandlerClass() {
        return null;
    }

    public static EventHandler instantiateEventHandler(Class<? extends EventHandler> handlerClass, boolean registered, EventType eventType, EventControl eventControl) throws Error {
    	return null;
    }
}
