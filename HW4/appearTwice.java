package HW4;
import java.util.HashSet;
import java.util.Set;

public class appearTwice {       // 여기서 뭐가 잘못된건가요?
    public boolean appearTwice(int[] nums){
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
