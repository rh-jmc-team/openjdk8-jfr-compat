package jdk.jfr.internal.settings;

import java.util.Set;

import jdk.jfr.Description;
import jdk.jfr.Label;
import jdk.jfr.MetadataDefinition;
import jdk.jfr.Name;
import jdk.jfr.Timespan;
import jdk.jfr.internal.Control;
import jdk.jfr.internal.PlatformEventType;
import jdk.jfr.internal.Type;

@MetadataDefinition
@Label("Cutoff")
@Description("Limit running time of event")
@Name(Type.SETTINGS_PREFIX + "Cutoff")
@Timespan
public final class CutoffSetting extends Control {

	public CutoffSetting(PlatformEventType eventType, String defaultValue) {
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

    public static long parseValueSafe(String value) {
    	return 0;
    }
}
