package jdk.jfr.internal.dcmd;

import jdk.jfr.internal.LogLevel;
import jdk.jfr.internal.LogTag;
import jdk.jfr.internal.Logger;
import jdk.jfr.internal.Options;
import jdk.jfr.internal.Repository;
import jdk.jfr.internal.SecuritySupport.SafePath;

final class DCmdConfigure extends AbstractDCmd {
    public String execute
    (
            String repositoryPath,
            String dumpPath,
            Integer stackDepth,
            Long globalBufferCount,
            Long globalBufferSize,
            Long threadBufferSize,
            Long memorySize,
            Long maxChunkSize,
            Boolean sampleThreads

    ) throws DCmdException {
        return null;
    }
}
