package org.ahernistan.util;

public class DuplicateKeyException extends Exception {

    public DuplicateKeyException(Object map, Object key, Object newValue, Object oldValue) {

        super("Using Key: '"
            + key.toString()
            + "' to attempted to add a new value '"
            + newValue.toString()
            + "' when there is already a value '"
            + oldValue.toString()
            + "' assigned to it for map '"
            + map.toString()
            +"'.");

    }

    public DuplicateKeyException(Object map, Object key, Object newValue, Object oldValue, Throwable cause) {

        super("Using Key: '"
                + key.toString()
                + "' to attempted to add a new value '"
                + newValue.toString()
                + "' when there is already a value '"
                + oldValue.toString()
                + "' assigned to it for map '"
                + map.toString()
                +"'.", cause);

    }
}
