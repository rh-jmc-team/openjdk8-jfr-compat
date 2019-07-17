package jdk.jfr.internal.jfc;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;

import jdk.jfr.Configuration;

public final class JFC {

	public static Configuration create(String name, Reader reader) throws IOException, ParseException {
        return null;
    }

    public static String nameFromPath(Path file) throws IOException {
    	return null;
    }

    // Invoked by DCmdStart
    public static Configuration createKnown(String name) throws IOException, ParseException {
    	return null;
    }

    public static List<Configuration> getConfigurations() {
    	return null;
    }

    public static Configuration getPredefined(String name) throws IOException, ParseException {
    	return null;
    }
}
