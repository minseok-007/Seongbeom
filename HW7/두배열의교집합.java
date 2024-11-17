package HW7;
import java.util.*;

import java.util.HashSet;
//두 정수 배열이 주어졌을 때, 배열의 교집합을 구하세요. 교집합의 결과는 중복 없이 반환합니다.
//입력 예시: arr1 = [1, 2, 2, 1], arr2 = [2, 2]
//출력 예시: [2]

public class 두배열의교집합 {
    public static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        Set<Integer> intersection = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                intersection.add(arr2[i]);
            }
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for (Integer integer : intersection) {
            result[i++] = integer;
        }
        return result;
    }
}
