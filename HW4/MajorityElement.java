package HW4;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int MajorityCount = nums.length / 2;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > MajorityCount) {
                return num;
            }
        }
        return //뭘 넣어야할지 모르겠어요
    }
}
