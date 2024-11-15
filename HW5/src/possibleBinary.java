package HW5.src;

public class possibleBinary {
    // 길이 n의 모든 가능한 binary 문자열 생성하기
    // input: integer n
    // ouput: 000, 001, 010, 011, 100, 101, 110, 111

    public static void main(String[] args) {
        int n = 3;
        generateBinaryStrings(n, "");

    }

    private static void generateBinaryStrings(int n, String binary) {
        if (binary.length() == n) {
            System.out.println(binary);
            return;
        }
        generateBinaryStrings(n, binary + "0");
        generateBinaryStrings(n, binary + "1");
    }

}
