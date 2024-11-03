package HW4;

import java.util.HashMap;

public class addUpToTarget {
    public int[] addUpToTarget (int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int differences = target - nums[i];
            if (map.containsKey(differences)) {
                return new int[]{map.get(differences), i};
            }
        }
        return new int []{};
    }
}
