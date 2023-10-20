package org.iesvdm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMap<K, V> implements IMultiMap<K, V> {
    private Map<K, List<V>> map;

    public MultiMap()
    {
        this.map = new HashMap<>();
    }

    public void add(K key, V value)
    {
        if (!map.containsKey(key))//Crea nueva lista si es que no contiene key
        {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    public List<V> getValuesForKey(K key)
    {
        return map.get(key);
    }

    //Comprobamos si aplica bien el multimap a cierto key
    public static void main(String[] args)
    {
        MultiMap<String, Integer> genericoStrInt = new MultiMap<>();

        genericoStrInt.add("a", 2);
        genericoStrInt.add("a", 5);
        genericoStrInt.add("b", 8);
        genericoStrInt.add("b", 6);
        genericoStrInt.add("b", 10);

        System.out.println(genericoStrInt.getValuesForKey("a"));
        System.out.println(genericoStrInt.getValuesForKey("b"));
    }
}