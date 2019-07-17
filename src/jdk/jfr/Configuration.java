package jdk.jfr;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import jdk.jfr.internal.JVMSupport;
import jdk.jfr.internal.jfc.JFC;

/**
 * A collection of settings and metadata describing the configuration.
 *
 * @since 9
 */
public final class Configuration {
    private final Map<String, String> settings;
    private final String label;
    private final String description;
    private final String provider;
    private final String contents;
    private final String name;

    // package private
    Configuration(String name, String label, String description, String provider, Map<String, String> settings, String contents) {
    }

    public Map<String, String> getSettings() {
        return new LinkedHashMap<String, String>();
    }

    public String getName() {
        return null;
    }

    public String getLabel() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public String getProvider() {
        return null;
    }

    public String getContents() {
        return null;
    }

    public static Configuration create(Path path) throws IOException, ParseException {
       return null;
    }

    public static Configuration create(Reader reader) throws IOException, ParseException {
        return null;
    }

    public static Configuration getConfiguration(String name) throws IOException, ParseException {
        return null;
    }

    public static List<Configuration> getConfigurations() {
        return null;
    }
}
