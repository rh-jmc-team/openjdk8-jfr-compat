package jdk.jfr.internal;

import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_CONSTANT_POOL;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_DEFAULT_VALUE;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_DIMENSION;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_GMT_OFFSET;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_ID;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_LOCALE;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_NAME;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_SIMPLE_TYPE;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_SUPER_TYPE;
import static jdk.jfr.internal.MetadataDescriptor.ATTRIBUTE_TYPE_ID;
import static jdk.jfr.internal.MetadataDescriptor.ELEMENT_ANNOTATION;
import static jdk.jfr.internal.MetadataDescriptor.ELEMENT_FIELD;
import static jdk.jfr.internal.MetadataDescriptor.ELEMENT_SETTING;
import static jdk.jfr.internal.MetadataDescriptor.ELEMENT_TYPE;

import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import jdk.jfr.AnnotationElement;
import jdk.jfr.SettingDescriptor;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.MetadataDescriptor.Attribute;
import jdk.jfr.internal.MetadataDescriptor.Element;
import jdk.jfr.internal.consumer.RecordingInput;

final class MetadataWriter {

    public MetadataWriter(MetadataDescriptor descriptor) {
    }

    public void writeBinary(DataOutput output) throws IOException {
    }

}
