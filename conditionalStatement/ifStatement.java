package conditionalStatement;

public class ifStatement {
    public static void main(String[] args) {
        /*
        if (conditional statement) {
            body
        }

        if (I am sick) {
            I will go to hospital
        }
         */

        int score = 80;
        if (score > 90) {
            System.out.println("You passed the exam");
        } else {
            System.out.println("You did not pass the exam");
        }

        /*
        if (conditional statement) {
            Perform this line of code if the conditional statement is true
        } else {
            Perform this line of code if the conditional statement is false
        }
         */

        /*
        if (conditional statement 1) {
        } else if (conditional statement 2) {
        } else if (conditional statement 3) {
        } else {
            // Perform this if none of the above is true.
        }
         */

        int newScore = 98;
        char grade = ' ';
        char option = ' ';

        // 각 점수에서 X7 이상이면 +, X2 이하면 - ==> ex) 97 = A+, 91 = A-

        if (newScore >= 90) {
            if (newScore >= 97) {
                option = '+';
            } else if (newScore <= 92) {
                option = '-';
            }
            grade = 'A';
        } else if (newScore >= 80) {
            grade = 'B';
        } else if (newScore >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Your grade is: " + grade + option);
    }
}
