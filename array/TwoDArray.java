package array;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        /*
        0  1   2  3
     0  [] [] [] []
     1  [] [] [] []
     2  [] [] [] []
         */

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 20;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int [][] score2 = {
                {50,40},
                {30,20},
                {70,80}
        };
        for (int i = 0; i < score2.length; i++) {
            for (int j = 0; j < score2[0].length; j++) {
                System.out.print(score2[i][j] + " ");
            }
            System.out.println();
        }

        // Find the minimum value of score2
        int min = score2[0][0];

        for (int i = 0; i < score2.length; i++) {
            for (int j = 0; j < score2[0].length; j++) {
                if (score2[i][j] < min) {
                    min = score2[i][j];
                }
            }
        }
        System.out.println(min);

        // Matrix addition

        int sum = 0;
        for (int i = 0; i < score2.length; i++) {
            for (int j = 0; j < score2[0].length; j++) {
                sum = sum + score2[i][j];
            }
        }
        System.out.println(sum);

        int [][] score3 = {
                {50,40,10},
                {30,20,90},
                {70,80,40}
        };

        // Diagonal Sum
        int sum2 = 0;
        for (int i = 0; i < score3.length; i++) {
            for (int j = 0; j < score3[0].length; j++) {
                if (i == j) {
                    sum2 += score3[i][j];
                }
            }
        }
        System.out.println(sum2);

        // Find a target value from 2D array (90) -- if target exists return true, if not, return false
        int target = 90;
        boolean flag = false;
        for (int i = 0; i < score3.length; i++) {
            for (int j = 0; j < score3[0].length; j++) {
                if (score3[i][j] == target) {
                    flag = true;
                    System.out.println("Target value exists");
                    break;
                }
            }
        }

        if (flag == false) {
            System.out.println("Target Value does not exist");
        }





    }
}
