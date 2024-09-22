package Day12.Generic;

// 제네릭 기법으로 타입 매개변수 2개 지정
class KeyValue <K, V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class TwoTypeGeneric {
    public static void main(String[] args) {
        KeyValue<String, Integer> keyValue = new KeyValue<String, Integer>();
        keyValue.setKey("Java");
        keyValue.setValue(100);

        KeyValue<String, Integer> keyValue2 = new KeyValue();
        keyValue2.setKey("Java");
        keyValue2.setValue(200);
    }
}
