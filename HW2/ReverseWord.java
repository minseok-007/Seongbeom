package HW2;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("hello world"));
    }

//    public static String reverseWords(String sentence) {
//        // hello world
//        // olleh dlrow
//
//        String[] words = sentence.split(" ");
//        String[] reverseWords = new String[words.length];
//
//        for (int i = 0; i < words.length; i++) {
//            char[] chars = words[i].toCharArray();
//            for (int j = 0; j < chars.length / 2; j++) {
//                char temp = chars[j];
//                chars[j] = chars[chars.length - 1 - j];
//                chars[chars.length - 1- j] = temp;
//            }
//            reverseWords[i] = new String(chars);
//        }
//
//        return String.join(" ", reverseWords);
//
//    }

    /*
    append(): 문자열을 추가
    insert(): 특정 위치에 문자열 삽입
    reverse(): 뒤집기
    toString(): StringBuilder -> String
     */
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String[] reversedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ", reversedWords);
    }
}
