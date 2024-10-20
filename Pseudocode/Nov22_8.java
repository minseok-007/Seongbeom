package Pseudocode;

public class Nov22_8 {
    public static void main(String[] args) {
        int k = 3;
        String[] names = {"Zixan", "Murali", "Eli", "Kim"};
        while(k >= 0) {
            int a = k % 3;
            System.out.println(names[a]);
            k = k - 1;
        }

        /*
        K       k >= 0      A       OUTPUT
        3        TRUE       0       Zixan
        2        TRUE       2       ELI
        ...
        0
        -1
         */
    }
}
