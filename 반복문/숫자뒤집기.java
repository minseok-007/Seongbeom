package 반복문;

import java.util.Scanner;

public class 숫자뒤집기 {
    public static void main(String[] args) {
        int num;
        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();

        // 1234 => 4321
        // 5 => 5
        // 16 => 61

        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }
}
