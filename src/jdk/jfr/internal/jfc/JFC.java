package jdk.jfr.internal.jfc;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jdk.jfr.Configuration;
import jdk.jfr.internal.LogLevel;
import jdk.jfr.internal.LogTag;
import jdk.jfr.internal.Logger;
import jdk.jfr.internal.SecuritySupport;
import jdk.jfr.internal.SecuritySupport.SafePath;

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
