package jdk.jfr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MetadataDefinition
@Label("Transition From")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TransitionFrom {
}
