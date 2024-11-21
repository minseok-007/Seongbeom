package HW8;
//배열에 주어진 길이를 사용해 삼각형을 만들 수 있는 조합의 개수를 구하세요. 삼각형의 조건은 세 변의 합 중 가장 큰 변이 다른 두 변의 합보다 작아야 합니다.
//Input: arr = [2, 2, 3, 4]
//Output: 3  // 가능한 삼각형: [2, 3, 4], [2, 2, 3], [2, 3, 4]

import java.util.Arrays;

public class 배열내요소로삼각형만들기 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        int count = countTriangles(arr);
        System.out.println(count); // Output: 3
    }
    public static int countTriangles(int[] arr) {
        if (arr.length < 3) return 0;
        Arrays.sort(arr);
        int count = 0;
        for (int i = arr.length - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
}

