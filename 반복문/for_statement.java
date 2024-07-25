package 반복문;

public class for_statement {
    /*
    for (initialize; conditional statement; increase / decrease) {
        initialize --> conditional statement (if true) --> inside the curly bracket { } 실행 --> increase / decrease
        --> conditional statement (if true) --> inside the curly bracket { } 실행 --> increase / decrease
        --> conditional statement (if false) --> For loop ends
    }
     */

    // i++ == i = i + 1
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Seongbeom");
            // i == 0 --> true --> print
            // i == 1 --> true --> print
            // i == 2 --> true --> print
            // i == 3 --> true --> print
            // i == 4 --> true --> print
        }

        // How can we solve the sum between 1 and 10 (1 + 2 + 3 + ... + 10)

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        *
        **
        ***
        ****
        *****
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
