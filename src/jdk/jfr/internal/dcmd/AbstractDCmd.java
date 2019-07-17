package jdk.jfr.internal.dcmd;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jdk.jfr.FlightRecorder;
import jdk.jfr.Recording;
import jdk.jfr.internal.JVM;
import jdk.jfr.internal.SecuritySupport;
import jdk.jfr.internal.SecuritySupport.SafePath;
import jdk.jfr.internal.Utils;

abstract class AbstractDCmd {

    protected AbstractDCmd() {
    }

    protected final FlightRecorder getFlightRecorder() {
        return null;
    }

    public final String getResult() {
        return null;
    }

    public String getPid() {
        return null;
    }

    protected final SafePath resolvePath(Recording recording, String filename) throws InvalidPathException {
        return null;
    }

    protected final Recording findRecording(String name) throws DCmdException {
    	return null;
    }

    protected final void reportOperationComplete(String actionPrefix, String name, SafePath file) {
    }

    protected final List<Recording> getRecordings() {
        return null;
    }

    static String quoteIfNeeded(String text) {
    	return null;
    }

    protected final void println() {
    }

    protected final void print(String s) {
    }

    protected final void print(String s, Object... args) {
    }

    protected final void println(String s, Object... args) {
    }

    protected final void printBytes(long bytes) {
    }

    protected final void printTimespan(Duration timespan, String separator) {
    }

    protected final void printPath(SafePath path) {
    }

    protected final void printPath(Path path) {
    }

}
