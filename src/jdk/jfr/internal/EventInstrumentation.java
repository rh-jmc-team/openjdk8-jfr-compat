package jdk.jfr.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.Type;
import jdk.internal.org.objectweb.asm.commons.Method;
import jdk.internal.org.objectweb.asm.tree.AnnotationNode;
import jdk.internal.org.objectweb.asm.tree.ClassNode;
import jdk.internal.org.objectweb.asm.tree.FieldNode;
import jdk.internal.org.objectweb.asm.tree.MethodNode;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Name;
import jdk.jfr.Registered;
import jdk.jfr.SettingControl;
import jdk.jfr.SettingDefinition;
import jdk.jfr.internal.handlers.EventHandler;

public final class EventInstrumentation {
    static final class SettingInfo {

        public SettingInfo(String fieldName, int index) {
        }
    }

    static final class FieldInfo {
        final String fieldName;
        final String fieldDescriptor;
        final String internalClassName;

        public FieldInfo(String fieldName, String fieldDescriptor, String internalClassName) {
        }

        public boolean isString() {
            return false;
        }
    }

    public static final String FIELD_EVENT_THREAD = "eventThread";
    public static final String FIELD_STACK_TRACE = "stackTrace";
    public static final String FIELD_DURATION = "duration";

    static final String FIELD_EVENT_HANDLER = "eventHandler";
    static final String FIELD_START_TIME = "startTime";

    EventInstrumentation(Class<?> superClass, byte[] bytes, long id) {
    }

    public String getClassName() {
      return null;
    }

    boolean isRegistered() {
        return false;
    }

    boolean isEnabled() {
        return false;
    }

    public static boolean isValidField(int access, String className) {
    	return false;
    }

    public byte[] buildInstrumented() {
    	return null;
    }

    public byte[] builUninstrumented() {
    	return null;
    }

    public static Method makeWriteMethod(List<FieldInfo> fields) {
    	return null;
    }

    public List<SettingInfo> getSettingInfos() {
        return null;
    }

    public List<FieldInfo> getFieldInfos() {
        return null;
    }

    public String getEventName() {
        return null;
    }

    public void setGuardHandler(boolean guardHandlerReference) {
    }
}
