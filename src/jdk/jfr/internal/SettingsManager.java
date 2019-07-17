package jdk.jfr.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringJoiner;

import jdk.jfr.internal.handlers.EventHandler;

final class SettingsManager {

	void setSettings(List<Map<String, String>> activeSettings) {
	}

    public void updateRetransform(List<Class<? extends jdk.internal.event.Event>> eventClasses) {
    }

    void setEventControl(EventControl ec) {
    }

    @Override
    public String toString() {
    	return null;
    }

    boolean isEnabled(String eventName) {
        return false;
    }
}
