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

import jdk.jfr.consumer.RecordingFile;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedClass;


import java.util.List;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.IOException;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class ConsumerTest {

	private RecordingFile recordingFile;
	@Before
	public void before() {
		try {
			Path recordingPath = Paths.get(System.getProperty("user.home"),"recording.jfr");
			recordingFile = new RecordingFile(recordingPath);
		} catch (IOException e) {
			 System.err.println("Failed to create recording file");
		}
		Assert.assertNotNull(recordingFile);
	}

	@Test
	public void testRecordedEventMethodsReturnNotNull() throws IOException {
		RecordedEvent event = recordingFile.readEvent();
		Assert.assertNotNull(event);

		Assert.assertNotNull(event.getEventType());
		Assert.assertNotNull(event.getStartTime());
		Assert.assertNotNull(event.getEndTime());
		Assert.assertNotNull(event.getDuration());
		Assert.assertNotNull(event.getFields());

	}

	@Test
	public void testRecordedClassMethodsReturnNotNull() throws IOException {
		RecordedEvent event = recordingFile.readEvent();
		Assert.assertNotNull(event);

		RecordedClass recordedClass = event.getClass("testClass");
		Assert.assertNotNull(recordedClass);

		String name = recordedClass.getName();
		Assert.assertNotNull(name);
	}

}
