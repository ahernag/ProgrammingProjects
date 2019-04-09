package org.ahernistan.util;

import java.util.HashMap;


public class UniqueHashMap<K, V> extends HashMap<K, V> {

    @Override
    public V put(K key, V value) {

        V v = null;

        try {
            v = putUnique(key, value);
        } catch (DuplicateKeyException e) {
            throw new RuntimeException(e);
        }

        return v;

    }

    private V putUnique(K key, V value) throws DuplicateKeyException {

        V v = super.get(key);

        if (v == null)
            v = super.put(key, value);
        else
            throw new DuplicateKeyException(this, key, value, v);

        return v;
    }
}
