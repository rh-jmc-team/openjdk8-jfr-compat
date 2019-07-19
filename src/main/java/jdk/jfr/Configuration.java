package jdk.jfr;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;
import java.util.Map;


public final class Configuration {

	public Map<String, String> getSettings() {
        return null;
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
