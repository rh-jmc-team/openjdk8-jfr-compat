package jdk.jfr.internal.dcmd;

import java.time.Instant;

import jdk.jfr.Recording;
import jdk.jfr.internal.PlatformRecorder;

final class DCmdDump extends AbstractDCmd {

	public String execute(String name, String filename, Long maxAge, Long maxSize, String begin, String end, Boolean pathToGcRoots) throws DCmdException {
		return null;
	}

    public void dump(PlatformRecorder recorder, Recording recording, String name, String filename, Long maxSize, Boolean pathToGcRoots, Instant beginTime, Instant endTime) throws DCmdException {
    }

}
