package jdk.jfr.consumer;


import java.io.IOException;

import jdk.jfr.EventType;
import jdk.jfr.internal.consumer.RecordingInput;

final class EventParser extends Parser {

    EventParser(TimeConverter timeConverter, EventType type, Parser[] parsers) {
    }

    @Override
    public Object parse(RecordingInput input) throws IOException {
    	return null;
    }
}
