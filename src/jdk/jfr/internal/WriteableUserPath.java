package jdk.jfr.internal;

import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.Callable;

public final class WriteableUserPath {
    public WriteableUserPath(Path path) throws IOException {
    }

    public Path getPotentiallyMaliciousOriginal() {
        return null;
    }

    public String getText() {
        return null;
    }

    public Path getReal() {
        return null;
    }

    public void doPriviligedIO(Callable<?> function) throws IOException {
    }
}
