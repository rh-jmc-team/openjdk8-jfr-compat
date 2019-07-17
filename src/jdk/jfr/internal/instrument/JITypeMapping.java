package jdk.jfr.internal.instrument;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface JITypeMapping {
    String from();
    String to();
}
