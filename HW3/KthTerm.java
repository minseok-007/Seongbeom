package HW3;

import java.util.HashSet;
import java.util.Set;

public class KthTerm {
    public static void main(String[] args) {
        int [] nums = {3, 2, 3, 1, 2, 4, 5, 5,6};
        int k = 4;
    }
    public static int kthTerm(int [] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return nums[i];
            }
        }
    }
}

// int [] nums = {1, 2, 3, 4, 5, 6};