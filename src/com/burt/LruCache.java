package com.burt;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K,V> {
    private HashMap<K, V> map;
    private final int capacity;

    public LruCache(int initialCapacity) {
        this.capacity = initialCapacity;

        this.map = new LinkedHashMap<K,V>(initialCapacity, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {

                return size() > initialCapacity;
            }
        };
    }

    public V get(K k){
        if (map.containsKey(k)) {
            return map.get(k);
        }
        return null;
    }

    public void set(K k, V v){
        map.put(k, v);
    }
}
