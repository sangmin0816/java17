package sec1;

import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();
        Properties map4 = new Properties(); // 속성 내포되어 있어 지정 안 함
        map1.put("no", 1);
        map1.put("kor", 100);
        map1.containsKey("no");
        map1.containsValue(50);
        map1.get("kor");
        map1.remove("no");
        for(Map.Entry<String, Integer> entrySet: map1.entrySet()){
            System.out.println(entrySet.getKey()+" "+entrySet.getValue());
        }

        map4.setProperty("나", "총점");
        // 무조건 문자열 입력
        map4.setProperty("padding", "30px");
        System.out.println(map4.getProperty("padding"));
    }
}