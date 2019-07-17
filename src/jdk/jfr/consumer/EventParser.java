package jdk.jfr.consumer;

import static jdk.jfr.internal.EventInstrumentation.FIELD_DURATION;

import java.io.IOException;
import java.util.List;

import jdk.jfr.EventType;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.consumer.RecordingInput;

final class EventParser extends Parser {

    EventParser(TimeConverter timeConverter, EventType type, Parser[] parsers) {
    }

    @Override
    public Object parse(RecordingInput input) throws IOException {
    	return null;
    }
}
