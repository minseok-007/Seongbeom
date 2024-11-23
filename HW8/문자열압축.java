package HW8;
//문제:주어진 문자열에서 연속된 문자를 압축하여 반복 횟수를 표시하세요. 단, 압축된 문자열이 원래 문자열보다 길면 원래 문자열을 반환하세요.
//Input: s = "aaabbccc"
//Output: "a3b2c3"
//Input: s = "abc"
//Output: "abc"  // 압축이 원래보다 길기 때문에 그대로 반환

public class 문자열압축 {

    public static String stringCompression(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        sb.append(s.charAt(s.length() - 1)).append(count);

//        if (sb.length() < s.length()) {
//            return sb.toString();
//        } else {
//            return s;
//        }

        return sb.length() < s.length() ? sb.toString() : s;
    }
    public static void main(String[] args) {
        System.out.println(stringCompression("aaabbccc"));
    }
}
