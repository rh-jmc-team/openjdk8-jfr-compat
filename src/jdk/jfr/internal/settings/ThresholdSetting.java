package jdk.jfr.internal.settings;

import java.util.Set;

import jdk.jfr.Description;
import jdk.jfr.Label;
import jdk.jfr.MetadataDefinition;
import jdk.jfr.Name;
import jdk.jfr.Timespan;
import jdk.jfr.internal.PlatformEventType;
import jdk.jfr.internal.Control;
import jdk.jfr.internal.Type;

@MetadataDefinition
@Label("Threshold")
@Name(Type.SETTINGS_PREFIX + "Threshold")
@Description("Record event with duration above or equal to threshold")
@Timespan
public final class ThresholdSetting extends Control {

    public ThresholdSetting(PlatformEventType eventType, String defaultValue) {
        super(defaultValue);

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

    public static boolean isType(long typeId) {
        return false;
    }

}
