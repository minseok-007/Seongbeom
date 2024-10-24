package HW3;

import java.util.Arrays;

public class Switch90 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9,},
        };
        int N = matrix.length;
        int[][] rotated = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotated[j][N - 1 - i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(rotated));

        // 다음 시간에 기존 matrix array 에다가 rotate 하는 거
    }
}
