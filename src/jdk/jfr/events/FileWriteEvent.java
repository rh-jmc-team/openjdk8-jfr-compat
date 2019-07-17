package jdk.jfr.events;

import jdk.jfr.Category;
import jdk.jfr.Description;
import jdk.jfr.Label;
import jdk.jfr.DataAmount;
import jdk.jfr.Name;
import jdk.jfr.internal.Type;

@Name(Type.EVENT_NAME_PREFIX + "FileWrite")
@Label("File Write")
@Category("Java Application")
@Description("Writing data to a file")
public final class FileWriteEvent extends AbstractJDKEvent {

    public static final ThreadLocal<FileWriteEvent> EVENT = new ThreadLocal<>();

    @Label("Path")
    @Description("Full path of the file")
    public String path;

    @Label("Bytes Written")
    @Description("Number of bytes written to the file")
    @DataAmount
    public long bytesWritten;

    public void reset() {
    }
}
