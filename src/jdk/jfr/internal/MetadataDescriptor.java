package jdk.jfr.internal;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import jdk.jfr.EventType;

public final class MetadataDescriptor {

    static final class Attribute {
        final String name;
        final String value;
    }

    static final class Element {
        final String name;
        final List<Element> elements = new ArrayList<>();
        final List<Attribute> attributes = new ArrayList<>();

        Element(String name) {
        }

        long longValue(String name) {
        }

        String attribute(String name) {
        	return null;
        }

        @Override
        public String toString() {
        	return null;
        }

        long attribute(String name, long defaultValue) {
            return 0;
        }

        String attribute(String name, String defaultValue) {
            return null;
        }

        List<Element> elements(String... names) {
            return null;
        }

        void add(Element element) {
        }

        void addAttribute(String name, Object value) {
        }

        Element newChild(String name) {
            return null;
        }

        public void addArrayAttribute(Element element, String name, Object value) {
        }
    }

    static final String ATTRIBUTE_ID = "id";
    static final String ATTRIBUTE_SIMPLE_TYPE = "simpleType";
    static final String ATTRIBUTE_GMT_OFFSET = "gmtOffset";
    static final String ATTRIBUTE_LOCALE = "locale";
    static final String ELEMENT_TYPE = "class";
    static final String ELEMENT_SETTING = "setting";
    static final String ELEMENT_ANNOTATION = "annotation";
    static final String ELEMENT_FIELD = "field";
    static final String ATTRIBUTE_SUPER_TYPE = "superType";
    static final String ATTRIBUTE_TYPE_ID = "class";
    static final String ATTRIBUTE_DIMENSION = "dimension";
    static final String ATTRIBUTE_NAME = "name";
    static final String ATTRIBUTE_CONSTANT_POOL = "constantPool";
    static final String ATTRIBUTE_DEFAULT_VALUE = "defaultValue";

    final List<EventType> eventTypes = new ArrayList<>();
    final Collection<Type> types = new ArrayList<>();
    long gmtOffset;
    String locale;
    Element root;

    // package private
    MetadataDescriptor() {
    }

    public Collection<Type> getTypes() {
        return null;
    }

    public List<EventType> getEventTypes() {
        return null;
    }

    public int getGMTOffset() {
        return 0;
    }

    public String getLocale() {
        return null;
    }

    public static MetadataDescriptor read(DataInput input) throws IOException {
        return null;
    }

    static void write(List<Type> types, DataOutput output) throws IOException {
    }

    @Override
    public String toString() {
        return null;
    }
}
