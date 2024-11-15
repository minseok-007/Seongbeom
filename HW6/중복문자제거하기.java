package HW6;
//문자열이 주어졌을 때, 중복된 문자를 제거하고 각 문자가 한 번씩만 나타나도록 새로운 문자열을 반환하는 메서드를 작성하세요. 순서는 원래 문자열의 첫 등장 순서를 유지합니다.
//예시 입력: "programming"
//예시 출력: "progamin"
//예시 입력: "hello"
//예시 출력: "helo"
import java.util.LinkedHashSet;
//HashSet이지만 순서를 유지해줌

public class 중복문자제거하기 {
    public static String removeDuplicates(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (char i : set) {
            result.append(i);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
        System.out.println(removeDuplicates("hello"));
    }
}
