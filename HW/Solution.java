package HW;

import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigit = new int[digits.length + 1];
        newDigit[0] = 1;
        return newDigit;
    }

    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        int[] result1 = plusOne(digits1);

        int[] digits2 = {8,9,9,9};
        int[] result2 = plusOne(digits2);

        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

//        System.out.println(Arrays.toString(result1));
    }
}
