package jdk.jfr.internal;

import java.util.List;
import java.util.Map;

public final class OldObjectSample {

    public static void emit(PlatformRecording recording) {
    }

    public static void emit(List<PlatformRecording> recordings, Boolean pathToGcRoots) {
    }

    public static void updateSettingPathToGcRoots(Map<String, String> s, Boolean pathToGcRoots) {
    }

    public static Map<String, String> createSettingsForSnapshot(PlatformRecording recording, Boolean pathToGcRoots) {
    	return null;
    }

}
