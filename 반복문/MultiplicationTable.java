package 반복문;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 숫자를 하나 입력받고, 구구단 만들기.
        int number;
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        System.out.println(number);

        // 3 x 1 = 3
        // 3 x 2 = 6

        for (int i = 1; i < 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
