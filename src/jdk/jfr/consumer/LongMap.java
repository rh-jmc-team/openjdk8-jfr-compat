package jdk.jfr.consumer;

import java.util.Iterator;

final class LongMap<T> implements Iterable<T> {

	LongMap() {
    }

    void put(long id, T object) {
    }

    T get(long id) {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    Iterator<Long> keys() {
        return null;
    }
}
