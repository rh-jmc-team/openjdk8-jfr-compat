/*
 * Copyright (c) 2019, Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2019, Red Hat Inc. All rights reserved.
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The contents of this file are subject to the terms of either the Universal Permissive License
 * v 1.0 as shown at http://oss.oracle.com/licenses/upl
 *
 * or the following license:
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted
 * provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions
 * and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other materials provided with
 * the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to
 * endorse or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import jdk.jfr.Event;
import jdk.jfr.AnnotationElement;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.EventFactory;
import jdk.jfr.Description;
import jdk.jfr.Name;
import jdk.jfr.Label;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class AnnotationElementTest{
	
	@Test
	public void testAnnotationElement() {
		List<AnnotationElement> typeAnnotations = new ArrayList<>();
		typeAnnotations.add(new AnnotationElement(Name.class, "com.example.HelloWorld"));
		typeAnnotations.add(new AnnotationElement(Label.class, "Hello World"));
		typeAnnotations.add(new AnnotationElement(Description.class, "Helps programmer getting started"));

		List<AnnotationElement> fieldAnnotations = new ArrayList<>();
		fieldAnnotations.add(new AnnotationElement(Label.class, "Message"));

		List<ValueDescriptor> fields = new ArrayList<>();
		fields.add(new ValueDescriptor(String.class, "message", fieldAnnotations));

		EventFactory f = EventFactory.create(typeAnnotations, fields);
		Event event = f.newEvent();
		event.commit();
	}
}
