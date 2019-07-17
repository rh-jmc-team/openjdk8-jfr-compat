package jdk.jfr.internal.tool;

import java.io.PrintWriter;

abstract class StructuredWriter {

	StructuredWriter(PrintWriter p) {
    }

    final protected int getColumn() {
        return 0;
    }

    // Flush to print writer
    public final void flush(boolean hard) {
    }

    final public void printIndent() {
    }

    final public void println() {
    }

    final public void print(String... texts) {
    }

    final public void printAsString(Object o) {
    }

    final public void print(String text) {
    }

    final public void print(char c) {
    }

    final public void print(int value) {
    }

    final public void indent() {
    }

    final public void retract() {
    }

    final public void println(String text) {
    }

}
