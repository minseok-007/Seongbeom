package HW5.src;
import java.util.HashMap;
import java.util.Map;
//문자열 s가 주어졌을 때, 문자열 내에 있는 문자들을 재배열하여 회문을 만들 수 있는지 확인하는 함수를 작성해 보세요. 회문을 만들 수 있으면 true, 아니면 false를 반환합니다.
//예시 입력: s = "civic"
//예시 출력: true (문자를 재배열하여 회문 가능)
//주어진 합을 가지는 두 수 찾기 (Two Sum)


public class 회문가능개수 {
    public static boolean canFormPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : map.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canFormPalindrome("cavic"));
    }

}