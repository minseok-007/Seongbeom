package HW6;
//정사각형 행렬(2차원 배열)이 주어질 때, 대각선 요소들의 합을 구하는 메서드를 작성하세요. 주 대각선과 부 대각선의 요소를 합산하세요.
//예시 입력: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//예시 출력: 15 (1 + 5 + 9 + 3 + 7)

public class 행렬대각선합구하기 {
    public static int diagnolsum(int[][] matrix){
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagnolsum(matrix));
    }
}
