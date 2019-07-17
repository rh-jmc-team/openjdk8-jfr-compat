package jdk.jfr.internal.tool;

import java.io.PrintStream;
import java.util.Deque;
import java.util.List;

final class Help extends Command {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public List<String> getOptionSyntax() {
        return null;
    }

    protected List<String> getAliases() {
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
