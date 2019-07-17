package jdk.jfr;

import java.security.AccessController;
import java.util.Set;

import jdk.jfr.internal.Control;

@MetadataDefinition

public abstract class SettingControl extends Control {

    protected SettingControl() {
    }

    @Override
    public abstract String combine(Set<String> settingValues);

    @Override
    public abstract void setValue(String settingValue);

    public abstract String getValue();
}
