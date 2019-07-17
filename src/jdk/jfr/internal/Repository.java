package jdk.jfr.internal;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

import jdk.jfr.internal.SecuritySupport.SafePath;

public final class Repository {

    public final static DateTimeFormatter REPO_DATE_FORMAT = DateTimeFormatter
            .ofPattern("yyyy_MM_dd_HH_mm_ss");

    public static Repository getRepository() {
        return null;
    }

    public synchronized void setBasePath(SafePath baseLocation) throws Exception {
    }

    synchronized void ensureRepository() throws Exception {
    }

    synchronized RepositoryChunk newChunk(Instant timestamp) {
    	return null;
    }

    synchronized void clear() {
    }

    public synchronized SafePath getRepositoryPath() {
        return null;
    }
}
