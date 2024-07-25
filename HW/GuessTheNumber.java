package HW;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        Scanner keyboard = new Scanner(System.in);
        int b = keyboard.nextInt();
        while (true) {
            if (a > b) {
                System.out.println("UP");
            } else if (a < b) {
                System.out.println("DOWN");
            } else {
                System.out.println("CORRECT");
                break;
            }
            b = keyboard.nextInt();
        }
    }
}
