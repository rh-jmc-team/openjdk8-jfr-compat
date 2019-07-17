/*
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package jdk.jfr.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.EntityResolver;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import jdk.internal.util.xml.SAXParser;
import jdk.internal.util.xml.impl.SAXParserImpl;
import jdk.jfr.AnnotationElement;
import jdk.jfr.Category;
import jdk.jfr.Description;
import jdk.jfr.Enabled;
import jdk.jfr.Experimental;
import jdk.jfr.Label;
import jdk.jfr.Period;
import jdk.jfr.Relational;
import jdk.jfr.StackTrace;
import jdk.jfr.Threshold;
import jdk.jfr.TransitionFrom;
import jdk.jfr.TransitionTo;
import jdk.jfr.Unsigned;

final class MetadataHandler extends DefaultHandler implements EntityResolver {

    static class TypeElement {
        List<FieldElement> fields = new ArrayList<>();
        String name;
        String label;
        String description;
        String category;
        String superType;
        String period;
        boolean thread;
        boolean startTime;
        boolean stackTrace;
        boolean cutoff;
        boolean isEvent;
        boolean experimental;
        boolean valueType;
    }

    static class FieldElement {
        TypeElement referenceType;
        String name;
        String label;
        String description;
        String contentType;
        String typeName;
        String transition;
        String relation;
        boolean struct;
        boolean array;
        boolean experimental;
        boolean unsigned;
    }

    static class XmlType {
        String name;
        String javaType;
        String contentType;
        boolean unsigned;
    }

    final Map<String, TypeElement> types = new LinkedHashMap<>(200);
    final Map<String, XmlType> xmlTypes = new HashMap<>(20);
    final Map<String, List<AnnotationElement>> xmlContentTypes = new HashMap<>(20);
    final List<String> relations = new ArrayList<>();
    long eventTypeId = 255;
    long structTypeId = 33;
    FieldElement currentField;
    TypeElement currentType;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
    }

    public static List<Type> createTypes() throws IOException {
        return null;
    }
}
