package jdk.jfr.internal.tool;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import jdk.jfr.EventType;
import jdk.jfr.internal.MetadataDescriptor;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.consumer.ChunkHeader;
import jdk.jfr.internal.consumer.RecordingInput;

final class Summary extends Command {

	@Override
    public String getName() {
        return null;
    }

    @Override
    public List<String> getOptionSyntax() {
    	return null;
    }

    @Override
    public void displayOptionUsage(PrintStream stream) {
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void execute(Deque<String> options) throws UserSyntaxException, UserDataException {
    }

}
