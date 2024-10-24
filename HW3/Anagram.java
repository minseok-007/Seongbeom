package HW3;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

//        HashMap<Character, Integer> mapT = new HashMap<>();
//        for (char c : t.toCharArray()) {
//            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {
//            char c = entry.getKey();
//            int freq = entry.getValue();
//
//            if (!mapT.containsKey(c) || mapT.get(c) != freq) {
//                return false;
//            }
//        }
//        return true;

        for (char c: t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
