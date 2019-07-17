package jdk.jfr.internal;

import java.security.AccessControlContext;
import java.util.Set;

abstract public class Control {

    public Control(AccessControlContext acc) {
    }

    public Control(String defaultValue) {
    }

    public abstract String combine(Set<String> values);

    public abstract void setValue(String value);

    public abstract String getValue();

    final void apply(Set<String> values) {
    }

    final void setDefault() {
    }

    final String getValueSafe() {
    	return null;
    }

    final void setValueSafe(String value) {
    }

    final String getDefaultValue() {
        return null;
    }

    final String getLastValue() {
        return null;
    }

    @Override
    public final Object clone() throws java.lang.CloneNotSupportedException {
    	return null;
    }

}
