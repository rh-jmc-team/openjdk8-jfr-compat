package jdk.jfr;

import java.security.AccessController;
import java.util.Set;


@MetadataDefinition
public abstract class SettingControl {

    protected SettingControl() {
    }

    public abstract String combine(Set<String> settingValues);

    public abstract void setValue(String settingValue);

    public abstract String getValue();
}
