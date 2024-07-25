public class Operator {
    // Operator: 연산자 (+,-,*...) --> signs that perform calculation
    // Operand: 피연산자 (3, 5, age) --> subject of operator

    public static void main(String[] args) {
        int b = 20;
        int a = b + 10;

        int x = 5;
        int y = x * 4 + 3;

        /*
        arithmetic operator: + - * / % (remainder)
        comparison operator: <   >   <=   >=  == (equal)  != (not equals)
        logical operator: && (AND) || (OR) ! (NOT)
         */

        int i = 5;
        i++; // i = i + 1
        int j = 10;
        j+=2; // j = j + 2
        int k = 20;
        k*=2; // k = k * 2

        // comparison operator
        System.out.println(10 < 5);

        // logical operator
        int age = 16;
        System.out.println(age > 15 && age < 13);

    }
}
