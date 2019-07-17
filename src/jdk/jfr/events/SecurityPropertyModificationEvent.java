package jdk.jfr.events;

import jdk.jfr.*;
import jdk.jfr.internal.MirrorEvent;

@Category({"Java Development Kit", "Security"})
@Label("Security Property Modification")
@Name("jdk.SecurityPropertyModification")
@Description("Modification of Security property")
@MirrorEvent(className = "jdk.internal.event.SecurityPropertyModificationEvent")
public final class SecurityPropertyModificationEvent extends AbstractJDKEvent {
    @Label("Key")
    public String key;

    @Label("Value")
    public String value;
}
