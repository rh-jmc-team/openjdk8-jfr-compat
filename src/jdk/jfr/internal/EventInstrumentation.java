package jdk.jfr.internal;

import java.util.List;

import jdk.internal.org.objectweb.asm.commons.Method;

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
        	this.fieldName = null;
        	this.fieldDescriptor = null;
        	this.internalClassName = null;
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
