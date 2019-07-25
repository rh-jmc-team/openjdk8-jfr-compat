/*
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2019, Red Hat Inc. All rights reserved.
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
import jdk.jfr.consumer.RecordedMethod;
import jdk.jfr.consumer.RecordedFrame;
import jdk.jfr.consumer.RecordedStackTrace;
import jdk.jfr.consumer.RecordedEvent;

import java.util.List;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.IOException;

import org.junit.Test;
import org.junit.Assert;

public class ConsumerTest {

	@Test
	public void testConsumerClasses() throws IOException {
		Path recordingPath = Paths.get(System.getProperty("user.home"),"recording.jfr");
		RecordingFile file = new RecordingFile(recordingPath);
		Assert.assertNotNull(file);

		RecordedEvent event = file.readEvent();
		Assert.assertNotNull(event);

		RecordedStackTrace stackTrace = event.getStackTrace();
		Assert.assertNotNull(stackTrace);

		List<RecordedFrame> frames= stackTrace.getFrames();
		Assert.assertNotNull(frames);
	}
}
