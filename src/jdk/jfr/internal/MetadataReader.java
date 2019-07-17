package jdk.jfr.internal;

import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_CONSTANT_POOL;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_DIMENSION;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_ID;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_NAME;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_SIMPLE_TYPE;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_SUPER_TYPE;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_TYPE_ID;
import static jdk.jfr.internal.MetadataDescriptor.ELEMENT_ANNOTATION;
import static jdk.jfr.internal.MetadataDescriptor.ELEMENT_FIELD;
import static jdk.jfr.internal.MetadataDescriptor.ELEMENT_SETTING;
import static jdk.jfr.internal.MetadataDescriptor.ELEMENT_TYPE;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jdk.jfr.AnnotationElement;
import jdk.jfr.SettingDescriptor;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.MetadataDescriptor.Element;


final class MetadataReader {

    public MetadataReader(DataInput input) throws IOException {
    }

    public MetadataDescriptor getDescriptor() {
        return null;
    }
}
