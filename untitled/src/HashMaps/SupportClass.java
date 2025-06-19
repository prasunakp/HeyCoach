package HashMaps;

public class SupportClass<K,V> {
    private K key;
    private V value;

    public SupportClass(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    // Getter method for value
    public V getValue() {
        return value;
    }
}
