package jdk.jfr.internal.dcmd;

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
