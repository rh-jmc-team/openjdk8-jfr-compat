package jdk.jfr.events;

import jdk.jfr.Category;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;
import jdk.jfr.internal.Type;

@Name(Type.EVENT_NAME_PREFIX + "ActiveSetting")
@Label("Recording Setting")
@Category("Flight Recorder")
@StackTrace(false)
public final class ActiveSettingEvent extends AbstractJDKEvent {

    @Label("Event Id")
    public long id;

    @Label("Setting Name")
    public String name;

    @Label("Setting Value")
    public String value;
}
