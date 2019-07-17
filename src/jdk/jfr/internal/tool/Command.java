package jdk.jfr.internal.tool;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.Deque;
import java.util.List;

abstract class Command {
    public final static String title = "Tool for working with Flight Recorder files (.jfr)";

    static void displayHelp() {
    }

    abstract public String getName();

    abstract public String getDescription();

    abstract public void execute(Deque<String> argList) throws UserSyntaxException, UserDataException;

    protected String getTitle() {
        return null;
    }

    static void displayAvailableCommands(PrintStream stream) {
    }

    protected static void displayCommand(PrintStream stream, Command c) {
    }

    public static List<Command> getCommands() {
        return null;
    }

    public static Command valueOf(String commandName) {
        return null;
    }

    public List<String> getOptionSyntax() {
        return null;
    }

    public void displayOptionUsage(PrintStream stream) {
    }

    protected boolean acceptOption(Deque<String> options, String expected) throws UserSyntaxException {
        return false;
    }

    protected void warnForWildcardExpansion(String option, String filter) throws UserDataException {
    }

    protected boolean acceptFilterOption(Deque<String> options, String expected) throws UserSyntaxException {
    	return false;
    }

    final protected void ensureMaxArgumentCount(Deque<String> options, int maxCount) throws UserSyntaxException {
    }

    final protected void ensureMinArgumentCount(Deque<String> options, int minCount) throws UserSyntaxException {
    }

    final protected Path getDirectory(String pathText) throws UserDataException {
    	return null;
    }

    final protected Path getJFRInputFile(Deque<String> options) throws UserSyntaxException, UserDataException {
    	return null;
    }

    final protected void couldNotReadError(Path p, IOException e) throws UserDataException {
    }

    final protected Path ensureFileDoesNotExist(Path file) throws UserDataException {
        return null;
    }

    final protected void ensureJFRFile(Path path) throws UserDataException {
    }

    protected void displayUsage(PrintStream stream) {
    }

    final protected void println() {
    }

    final protected void print(String text) {
    }

    final protected void println(String text) {
    }

    final protected boolean matches(String command) {
        return false;
    }

    protected List<String> getAliases() {
        return null;
    }

    public List<String> getNames() {
        return null;
    }
}
