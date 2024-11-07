package HW4;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {1,-1,3};
        int majElem = majorityElement(nums);
        System.out.println(majElem);
//        if (majElem == -110) {
//            System.out.println("There is no majority element");
//        } else {
//            System.out.println("Majority element is: " + majElem);
//        }

    }
    // -109 <= nums[i] <= 109
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int MajorityCount = nums.length / 2;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > MajorityCount) {
                return num;
            }
        }
        throw new IllegalArgumentException("No majority element found");
    }
}

