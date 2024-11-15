package HW5.src;

import java.util.HashSet;
import java.util.Set;

//문자열 s가 주어졌을 때, 문자열 내 문자의 모든 가능한 순열을 생성하는 함수를 작성해 보세요.
//예시 입력: s = "abc"
//예시 출력: {"abc", "acb", "bac", "bca", "cab", "cba"}
public class 모든순열생성 {

    public static void main(String[] args) {
        System.out.println(permutation("abc"));
    }

    public static Set<String> permutation(String s) {
        Set<String> result = new HashSet<>();
        helper(s, "", result);
        return result;
    }

    private static void helper(String s, String current, Set<String> result) {
        if (current.length() == 3) {
            result.add(current);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            helper(s.substring(0, i) + s.substring(i + 1), current + s.charAt(i), result);
        }
    }
}
