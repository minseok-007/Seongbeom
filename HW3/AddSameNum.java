package HW3;

import java.util.HashSet;
import java.util.Set;

public class AddSameNum {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 2, 3, 4,};
        int [] arr2 = {2, 3, 5, 7};
        int sum = 0;

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        } // 1 2 3 4
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                set2.add(arr2[i]);
            }
        }

        for (int num : set2) {
            sum += num;
        }

        System.out.println(sum);
    }
}
