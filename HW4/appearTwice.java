package HW4;
import java.util.HashSet;
import java.util.Set;

public class appearTwice {       // 여기서 뭐가 잘못된건가요?

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(checkIfAppearsTwice(nums));
    }
    public static boolean checkIfAppearsTwice(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
