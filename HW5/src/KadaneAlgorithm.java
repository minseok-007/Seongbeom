package HW5.src;
import java.lang.Math;
import java.util.Scanner;

//연속된 부분 배열의 최대 합 구하기 (Kadane’s Algorithm)
//정수 배열 arr이 주어졌을 때, 연속된 부분 배열 중 합이 가장 큰 값을 반환하는 함수를 작성해 보세요. (음수도 포함될 수 있음)
//예시 입력: arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}
//예시 출력: 6 (부분 배열 [4, -1, 2, 1]의 합)
//고유한 문자 조합 구하기

public class KadaneAlgorithm {
    public static void findMax(int[] arr) {
        int maxsum = arr[0];
        int currentsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentsum = Math.max(arr[i], arr[i] + currentsum);
            maxsum = Math.max(maxsum, currentsum);
        }
        System.out.println (maxsum);
    }

    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        findMax(arr);
    }
}

