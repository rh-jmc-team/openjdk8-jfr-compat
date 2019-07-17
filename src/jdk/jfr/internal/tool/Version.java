package jdk.jfr.internal.tool;

import java.util.Deque;
import java.util.List;

final class Version extends Command {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void execute(Deque<String> options) {
    }

    protected List<String> getAliases() {
        return null;
    }
}
