package HW3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KthTerm {
    public static void main(String[] args) {
        int [] nums = {3, 2, 3, 1, 2, 4, 5, 5,6};
        int k = 4;
        System.out.println(kthTerm(nums, k));
    }

    // 6 5 4 3 2 1
    public static int kthTerm(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        Integer[] sortedArr = set.toArray(new Integer[0]);
        Arrays.sort(sortedArr);
        // 1 2 3 4 5 6
        return sortedArr[sortedArr.length - k];
    }
}

// int [] nums = {1, 2, 3, 4, 5, 6};