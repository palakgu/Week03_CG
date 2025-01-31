package hashmap_hashing.custom_hashmap;

import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing key
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null; // Key not found
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            buckets[index].removeIf(entry -> entry.key.equals(key));
        }
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }
}