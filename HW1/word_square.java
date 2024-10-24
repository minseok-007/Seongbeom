package HW1;

public class word_square {
    public static void main(String[] args) {
        String[] words1 = {"abcd", "bnrt", "crmy", "dtye"};
        String[] words2 = {"abcd", "bnrt", "crm", "dt"};
        String[] words3 = {"ball", "area", "read", "lady"};

        System.out.println(isValidWordSquare(words1));
        System.out.println(isValidWordSquare(words2));
        System.out.println(isValidWordSquare(words3));
    }

    /*
    a b c d
    b n r t
    c r m y
    d y t e
     */

    public static boolean isValidWordSquare(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (j >= words.length || i >= words[j].length() || word.charAt(j) != words[j].charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
