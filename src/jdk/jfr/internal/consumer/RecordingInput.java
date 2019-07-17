package jdk.jfr.internal.consumer;

import java.io.DataInput;
import java.io.File;
import java.io.IOException;

public final class RecordingInput implements DataInput, AutoCloseable {

    public static final byte STRING_ENCODING_NULL = 0;
    public static final byte STRING_ENCODING_EMPTY_STRING = 1;
    public static final byte STRING_ENCODING_CONSTANT_POOL = 2;
    public static final byte STRING_ENCODING_UTF8_BYTE_ARRAY = 3;
    public static final byte STRING_ENCODING_CHAR_ARRAY = 4;
    public static final byte STRING_ENCODING_LATIN1_BYTE_ARRAY = 5;

    public RecordingInput(File f) throws IOException {
    }

    @Override
    public final byte readByte() throws IOException {
        return 0;
    }

    @Override
    public final void readFully(byte[] dest, int offset, int length) throws IOException {
    }

    @Override
    public final void readFully(byte[] dst) throws IOException {
    }

    public final short readRawShort() throws IOException {
    	return 0;
    }

    @Override
    public final double readDouble() throws IOException {
    	return 0;
    }

    @Override
    public final float readFloat() throws IOException {
    	return 0;
    }

    public final int readRawInt() throws IOException {
    	return 0;
    }

    public final long readRawLong() throws IOException {
    	return 0;
    }

    public final long position() throws IOException {
    	return 0;
    }

    public final void position(long newPosition) throws IOException {
    }

    public final long size() throws IOException {
    	return 0;
    }

    public final void close() throws IOException {
    }

    @Override
    public final int skipBytes(int n) throws IOException {
    	return 0;
    }

    @Override
    public final boolean readBoolean() throws IOException {
    	return false;
    }

    @Override
    public int readUnsignedByte() throws IOException {
    	return 0;
    }

    @Override
    public int readUnsignedShort() throws IOException {
    	return 0;
    }

    @Override
    public final String readLine() throws IOException {
    	return null;
    }

    @Override
    public String readUTF() throws IOException {
    	return null;
    }

    public String readEncodedString(byte encoding) throws IOException {
    	return null;
    }

    @Override
    public char readChar() throws IOException {
    	return 0;
    }

    @Override
    public short readShort() throws IOException {
    	return 0;
    }

    @Override
    public int readInt() throws IOException {
    	return 0;
    }

    @Override
    public long readLong() throws IOException {
    	return 0;
    }
}
