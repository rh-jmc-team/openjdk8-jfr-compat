package jdk.jfr.consumer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jdk.jfr.EventType;
import jdk.jfr.ValueDescriptor;
import jdk.jfr.internal.MetadataDescriptor;
import jdk.jfr.internal.PrivateAccess;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.consumer.RecordingInput;
final class ParserFactory {

    public ParserFactory(MetadataDescriptor metadata, TimeConverter timeConverter) throws IOException {
    }

    public LongMap<Parser> getParsers() {
        return null;
    }

    public LongMap<ConstantMap> getConstantPools() {
        return null;
    }

    public LongMap<Type> getTypeMap() {
        return null;
    }

}
