package HW;

public class StringReverse {
    public static void main(String[] args) {
        String str = "hello";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        String str2 = "hello";
        int length2 = str.length();
        while (length2 > 0) {
            length2--;
            System.out.print(str.charAt(length2));
        }

    }
}
