package HW6;
//두 개의 정렬된 정수 배열이 주어질 때, 이를 하나의 배열로 병합하고 정렬하여 반환하는 메서드를 작성하세요.
//예시 입력: [1, 3, 5], [2, 4, 6]
//예시 출력: [1, 2, 3, 4, 5, 6]

import java.util.Arrays;

public class 두배열병합및정렬 {
    public static int[] addTwoarr (int [] a, int [] b ){
    int [] addedarr = new int[a.length + b.length];
    System.arraycopy(a, 0, addedarr, 0, a.length);
    System.arraycopy(b, 0, addedarr, a.length, b.length);
    Arrays.sort(addedarr);
    return addedarr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] result = addTwoarr(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
