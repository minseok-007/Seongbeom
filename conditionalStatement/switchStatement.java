package conditionalStatement;

import java.util.Scanner;
public class switchStatement {
    public static void main(String[] args) {
        // 봄: 3,4,5 / 여름: 6,7,8 / 가을: 9,10,11 / 겨울: 12,1,2

        System.out.println("Type the month");
        int month = 0;
        Scanner keyboard = new Scanner(System.in);
        month = keyboard.nextInt();

        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring!");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer!");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Fall!");
        } else {
            System.out.println("Winter");
        }

        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring!");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            case 12: case 1: case 2:
                System.out.println("Winter");
        }



    }
}
