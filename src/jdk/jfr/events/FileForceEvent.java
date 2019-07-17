package jdk.jfr.events;

import jdk.jfr.Category;
import jdk.jfr.Description;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.internal.Type;

@Name(Type.EVENT_NAME_PREFIX + "FileForce")
@Label("File Force")
@Category("Java Application")
@Description("Force updates to be written to file")
public final class FileForceEvent extends AbstractJDKEvent {

    public static final ThreadLocal<FileForceEvent> EVENT =
        new ThreadLocal<>();

    @Label("Path")
    @Description("Full path of the file")
    public String path;

    @Label("Update Metadata")
    @Description("Whether the file metadata is updated")
    public boolean metaData;

    public void reset() {
    }
}
