package jdk.jfr.internal.instrument;

import java.io.IOException;

@Deprecated
final class JIClassInstrumentation {

	JIClassInstrumentation(Class<?> instrumentor, Class<?> target, byte[] old_target_bytes) throws ClassNotFoundException, IOException {
    }

    public byte[] getNewBytes() {
        return null;
    }

}
