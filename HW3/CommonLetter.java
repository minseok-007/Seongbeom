package HW3;

import java.util.HashMap;
import java.util.Map;

public class CommonLetter {
    public static void main(String[] args) {
        String input = "cccbbaaa";
        System.out.println(findMostFrequentCharacter(input));
    }

    public static char findMostFrequentCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // a : 1 b : 2 c : 3

        int maxFrequency = 0;
        char result = s.charAt(0);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                result = entry.getKey();
            } // else if
        }
        return result;
    }
}

/*
4. 문자열 내에서 가장 자주 등장하는 문자 찾기
주어진 문자열에서 가장 자주 등장하는 문자를 찾아라. 같은 빈도로 등장하는 문자가 여러 개일 경우, 사전순으로 가장 앞에 있는 문자를 반환하라.

입력: "abbccc"
출력: 'c'

 */