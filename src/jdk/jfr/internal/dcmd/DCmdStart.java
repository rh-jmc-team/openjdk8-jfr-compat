package jdk.jfr.internal.dcmd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import jdk.jfr.FlightRecorder;
import jdk.jfr.Recording;
import jdk.jfr.internal.JVM;
import jdk.jfr.internal.LogLevel;
import jdk.jfr.internal.LogTag;
import jdk.jfr.internal.Logger;
import jdk.jfr.internal.OldObjectSample;
import jdk.jfr.internal.PrivateAccess;
import jdk.jfr.internal.SecuritySupport.SafePath;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.jfc.JFC;

final class DCmdStart extends AbstractDCmd {

    @SuppressWarnings("resource")
    public String execute(String name, String[] settings, Long delay, Long duration, Boolean disk, String path, Long maxAge, Long maxSize, Boolean dumpOnExit, Boolean pathToGcRoots) throws DCmdException {
    	return null;
    }

}
