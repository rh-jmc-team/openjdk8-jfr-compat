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

import jdk.jfr.Recording;
import jdk.jfr.Configuration;
import jdk.jfr.Event;
import jdk.jfr.EventFactory;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.AnnotationElement;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class RecordingTest {

	private Event testEvent;
	@Before
	public void before() {
		List<AnnotationElement> annotationElements = new ArrayList<>();
		List<ValueDescriptor> fields = new ArrayList<>();
		EventFactory f = EventFactory.create(annotationElements, fields);
		testEvent = f.newEvent();
	}

	@Test
	public void testRecordingLifeCycle() throws Exception {
		   Configuration c = Configuration.getConfiguration("default");
		   Recording r = new Recording(c);
		   r.start();
		   System.gc();
		   Thread.sleep(100);
		   r.stop();
		   Path jfrFilePath = Paths.get(System.getProperty("user.home"), "jfr_temp.jfr");
		   r.dump(jfrFilePath);
	   }

	@Test
	public void testRecordingEnableDisable() throws Exception {
		   Configuration c = Configuration.getConfiguration("default");
		   Recording r = new Recording(c);

		   r.enable(testEvent.getClass()).with("threshold","20 ms");
		   r.disable(testEvent.getClass()).with("threshold","20 ms");
	   }
}
