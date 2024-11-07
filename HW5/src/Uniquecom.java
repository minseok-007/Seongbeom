package HW5.src;
import java.util.HashSet;
import java.util.Set;

//고유한 문자 조합 구하기
//
//문자열 s가 주어졌을 때, 문자열 내에서 고유한 문자 조합을 구하는 함수를 작성해 보세요. 중복된 조합은 제외하고, 각 조합의 길이가 n 이상이어야 합니다.
//예시 입력: s = "abc", n = 2
//예시 출력: {"ab", "ac", "bc", "abc"}
//회문 가능한 문자 개수 세기

public class Uniquecom {
    public static void main(String[] args) {
        System.out.println(uniqueCombinations("abc", 2));
    }

    public static Set<String> uniqueCombinations(String s, int n) {
        Set<String> result = new HashSet<>();
        generateCombinations(s, "", 0, n, result);
        return result;
    }

    private static void generateCombinations(String s, String current, int index, int n, Set<String> result) {
        if (current.length() >= n) {
            result.add(current);
        }

        for (int i = index; i < s.length(); i++) {
            generateCombinations(s, current + s.charAt(i), i + 1, n, result);
        }
    }
}
