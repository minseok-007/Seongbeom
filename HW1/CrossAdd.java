package HW1;

public class CrossAdd {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int firstdiagnol = 0;
        int seconddiagnol = 0;

        for (int i = 0; i < matrix.length; i++) {
            firstdiagnol += matrix[i][i];
            seconddiagnol += matrix[i][matrix.length - i - 1];
        }
        System.out.println(firstdiagnol + seconddiagnol);
    }
}