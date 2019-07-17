package jdk.jfr.internal;

import static jdk.jfr.internal.LogLevel.DEBUG;
import static jdk.jfr.internal.LogLevel.WARN;
import static jdk.jfr.internal.LogTag.JFR;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.TimerTask;
import java.util.TreeMap;

import jdk.jfr.Configuration;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;
import jdk.jfr.RecordingState;
import jdk.jfr.internal.SecuritySupport.SafePath;

public final class PlatformRecording implements AutoCloseable {

    PlatformRecording(PlatformRecorder recorder, long id) {
    }

    public void start() {
    }

    public boolean stop(String reason) {
        return false;
    }

    public void scheduleStart(Duration delay) {
    }

    void scheduleStart(Instant startTime) {
    }

    public Map<String, String> getSettings() {
    	return null;
    }

    public long getSize() {
        return 0;
    }

    public Instant getStopTime() {
        return null;
    }

    public Instant getStartTime() {
        return null;
    }

    public Long getMaxSize() {
        return null;
    }

    public Duration getMaxAge() {
        return null;
    }

    public String getName() {
        return null;
    }

    public RecordingState getState() {
        return null;
    }

    @Override
    public void close() {
    }

    public PlatformRecording newSnapshotClone(String reason, Boolean pathToGcRoots) throws IOException {
        return null;
    }

    public boolean isToDisk() {
        return false;
    }

    public void setMaxSize(long maxSize) {
    }

    public void setDestination(WriteableUserPath userSuppliedPath) throws IOException {
    }

    public WriteableUserPath getDestination() {
    	return null;
    }

    void setState(RecordingState state) {
    }

    void setStartTime(Instant startTime) {
    }

    void setStopTime(Instant timeStamp) {
    }

    public long getId() {
    	return 0;
    }

    public void setName(String name) {
    }

    public void setDumpOnExit(boolean dumpOnExit) {
    }

    public boolean getDumpOnExit() {
    	return false;
    }

    public void setToDisk(boolean toDisk) {
    }

    public void setSetting(String id, String value) {
    }

    public void setSettings(Map<String, String> settings) {
    }

    public void setRecording(Recording recording) {
    }

    public Recording getRecording() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public void setConfiguration(Configuration c) {
    }

    public void setMaxAge(Duration maxAge) {
    }

    void appendChunk(RepositoryChunk chunk) {
    }

    void add(RepositoryChunk c) {
    }

    public List<RepositoryChunk> getChunks() {
        return null;
    }

    public InputStream open(Instant start, Instant end) throws IOException {
    	return null;
    }

    public Duration getDuration() {
        return null;
    }

    void setInternalDuration(Duration duration) {
    }

    public void setDuration(Duration duration) {
    }

    void updateTimer() {
    }

    TimerTask createStopTask() {
    	return null;
    }

    public Recording newCopy(boolean stop) {
        return null;
    }

    void setStopTask(TimerTask stopTask) {
    }

    void clearDestination() {
    }

    public AccessControlContext getNoDestinationDumpOnExitAccessControlContext() {
        return null;
    }

    void setShouldWriteActiveRecordingEvent(boolean shouldWrite) {
    }

    boolean shouldWriteMetadataEvent() {
        return false;
    }

    public void dump(WriteableUserPath writeableUserPath) throws IOException {
    }

    public void dumpStopped(WriteableUserPath userPath) throws IOException {
    }

    public void filter(Instant begin, Instant end, Long maxSize) {
    }

    public void setDumpOnExitDirectory(SafePath directory) {
    }

    public SafePath getDumpOnExitDirectory()  {
        return null;
    }
}
