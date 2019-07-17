package jdk.jfr.internal.dcmd;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;

import jdk.jfr.FlightRecorder;
import jdk.jfr.Recording;
import jdk.jfr.internal.LogLevel;
import jdk.jfr.internal.LogTag;
import jdk.jfr.internal.Logger;
import jdk.jfr.internal.PlatformRecorder;
import jdk.jfr.internal.PlatformRecording;
import jdk.jfr.internal.PrivateAccess;
import jdk.jfr.internal.SecuritySupport.SafePath;
import jdk.jfr.internal.Utils;
import jdk.jfr.internal.WriteableUserPath;

final class DCmdDump extends AbstractDCmd {

	public String execute(String name, String filename, Long maxAge, Long maxSize, String begin, String end, Boolean pathToGcRoots) throws DCmdException {
		return null;
	}

    public void dump(PlatformRecorder recorder, Recording recording, String name, String filename, Long maxSize, Boolean pathToGcRoots, Instant beginTime, Instant endTime) throws DCmdException {
    }

}
