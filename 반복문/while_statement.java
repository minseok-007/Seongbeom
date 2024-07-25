package 반복문;

public class while_statement {
    /*
    while (condition) {
        While condition is true, the statement in the bracket is conducted.
        After conducting, then check the condition again and if it is true,
        do the same thing (repeat), and if it is false, terminate the while loop.
    }
     */

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
