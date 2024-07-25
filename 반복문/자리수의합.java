package 반복문;

import java.util.Scanner;

public class 자리수의합 {
    public static void main(String[] args) {
        // 1234 ==> 10
        // 56 ==> 11
        // Use mod (%)
        int num;
        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();
        int eachNum;
        int sum = 0;

        while(num != 0) {
            eachNum = num % 10;
            sum += eachNum;
            num /= 10;
        }
        System.out.println(sum);
    }
}
