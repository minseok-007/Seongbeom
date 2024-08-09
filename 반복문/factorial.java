package 반복문;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // 5! = 5x4x3x2x1
        int num;
        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
