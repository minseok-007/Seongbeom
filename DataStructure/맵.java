package DataStructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 맵 {
    /*
    - key - value 쌍으로 데이터를 저장하는 data structure.
    Ex) 전화번호부 -> key: 이름 / value: 전화번호
    - 같은 Key를 두 번 사용 X (no duplication): 만약 same key로 값을 다시 저장하면, 기존 value는
      new value로 덮어 씌워짐.
     - 순서 X
     - 빠른 검색 속도
     */

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1000);
        map.put("Peach", 3000);
        map.put("Orange", 2000);

        // check if key exists
        if (map.containsKey("Apple")) {
            System.out.println("Apple exists");
        }

        int priceOfPeach = map.get("Peach");

        if (map.containsValue(1000)) {
            System.out.println("Value 1000 exists");
        }

        map.remove("Apple");
//        map.clear(); // HashMap 전체 다 비우기

        map.putIfAbsent("Apple", 1200);

        System.out.println(map.get("Apple"));

        // 주어진 Key가 존재하면 새로운 Value로 교체
        map.replace("Apple", 1300);

        // 주어진 key가 존재하면, 해당 값 반환, 없으면 defaultValue = 0
        int price = map.getOrDefault("Apple", 0);
        System.out.println(price);

        // keySet(): HashMap에서 저장된 모든 키들을 Set 컬렉션으로 반환
        // values(): HashMap에 저장된 모든 value를 Collection 반한

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        Collection<Integer> values = map.values();
        for (int value : values) {
            System.out.println(value);
        }

        // entrySet(): HashMap의 모든 key - value pair을
        // Set<Map.Entry<K, V>> 로 반환. key, value를 같이 사용할 때 유용

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
