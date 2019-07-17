package jdk.jfr.consumer;

import java.io.IOException;

import jdk.jfr.internal.MetadataDescriptor;
import jdk.jfr.internal.Type;
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
