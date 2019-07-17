package jdk.jfr.internal.tool;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;

import jdk.jfr.consumer.RecordingFile;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.consumer.RecordingInternals;

final class Metadata extends Command {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public List<String> getOptionSyntax() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void execute(Deque<String> options) throws UserSyntaxException, UserDataException {
    }
}
