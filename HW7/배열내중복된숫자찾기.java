package HW7;
import java.util.*;
//정수 배열에서 중복된 숫자를 찾아 모두 반환하세요. 중복된 숫자는 한 번만 출력합니다.
//입력 예시: nums = [4, 3, 2, 7, 8, 2, 3, 1]
//출력 예시: [2, 3]

public class 배열내중복된숫자찾기 {
    public static List<Integer> findSameNum(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> sameNum = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                sameNum.add(nums[i]);
            }else{
                seen.add(nums[i]);
            }
        }
        return new ArrayList<>(sameNum);
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findSameNum(nums);
        System.out.println(result);
    }
}
