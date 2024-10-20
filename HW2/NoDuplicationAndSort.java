package HW2;

import java.util.*;

public class NoDuplicationAndSort {
    public static void main(String[] args) {
        System.out.println(removeDuplicationAndSort("Hello World"));
    }

    /*
    입력 예제: String input = "Hello World";
      출력 예제: "dehlorw"

     */
    public static String removeDuplicationAndSort(String input) {
        input = input.toLowerCase();
        Set<Character> unique = new HashSet<>();

        for(char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                unique.add(c);
            }
        }

        List<Character> sortedList = new ArrayList<>(unique);
        Collections.sort(sortedList);

        StringBuilder sb = new StringBuilder();
        for (char c : sortedList) {
            sb.append(c);
        }

        return sb.toString();
    }
}
