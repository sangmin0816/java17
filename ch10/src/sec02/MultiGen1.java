package sec02;

import java.util.Map;

public class MultiGen1<K, V> implements Map.Entry<K, V> { // 맵 자체가 아니라 맵의 구조만 가져옴.
    private K k;
    private V v;

    @Override
    public K getKey() {
        return this.k;
    }

    @Override
    public V getValue() {
        return this.v;
    }

    @Override
    public V setValue(V value) {
        this.v = value;
        return this.v;
    }

    public MultiGen1() {
    }
}
