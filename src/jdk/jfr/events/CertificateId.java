package jdk.jfr.events;

import jdk.jfr.Label;
import jdk.jfr.Relational;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Label("X509 Certificate Id")
@Relational
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CertificateId {
}
