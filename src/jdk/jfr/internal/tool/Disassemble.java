package jdk.jfr.internal.tool;

import java.io.PrintStream;
import java.util.Deque;
import java.util.List;

import jdk.jfr.internal.consumer.ChunkHeader;
import jdk.jfr.internal.consumer.RecordingInput;

final class Disassemble extends Command {

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
