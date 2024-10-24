package HW3;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

    }
}
