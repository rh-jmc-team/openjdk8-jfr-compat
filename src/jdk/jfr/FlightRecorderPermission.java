package jdk.jfr;

import java.util.Objects;

@SuppressWarnings("serial")
public final class FlightRecorderPermission extends java.security.BasicPermission {

    
    public FlightRecorderPermission(String name) {
    	 super(Objects.requireNonNull(name));
    }
}
