package org.iesvdm;

import java.util.List;

public interface IMultiMap<K, V> {
    void add(K key, V value);
    List<V> getValuesForKey(K key);
}
