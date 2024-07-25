package HW;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                break;
            }
        }
        System.out.println("Prime number");

    }
}
