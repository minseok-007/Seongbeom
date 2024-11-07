package HW4;

import java.util.Arrays;
import java.util.HashMap;

public class addUpToTarget {

    public static void main(String[] args) {
        int[] nums = {2,7,11,5};
        int target = 9;

        int[] index = addUpToTarget(nums, target);
//        for (int i = 0; i < index.length; i++) {
//            System.out.print(index[i] + " ");
//        }
        System.out.println(Arrays.toString(index));
    }
    public static int[] addUpToTarget (int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int differences = target - nums[i];
            if (map.containsKey(differences)) {
                return new int[]{map.get(differences), i};
            }
            map.put(nums[i], i);
        }
        return new int []{};
    }
}
