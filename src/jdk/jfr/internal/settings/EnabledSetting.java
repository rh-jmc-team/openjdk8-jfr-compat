package jdk.jfr.internal.settings;

import java.util.Objects;
import java.util.Set;

import jdk.jfr.Description;
import jdk.jfr.BooleanFlag;
import jdk.jfr.Label;
import jdk.jfr.MetadataDefinition;
import jdk.jfr.Name;
import jdk.jfr.internal.PlatformEventType;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.Control;

@MetadataDefinition
@Label("Enabled")
@Description("Record event")
@Name(Type.SETTINGS_PREFIX + "Enabled")
@BooleanFlag
public final class EnabledSetting extends Control {

    public EnabledSetting(PlatformEventType eventType, String defaultValue) {
    }

    @Override
    public String combine(Set<String> values) {
        return null;
    }

    @Override
    public void setValue(String value) {
    }

    @Override
    public String getValue() {
        return null;
    }
}
