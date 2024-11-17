package HW7;
import java.util.*;
//정수 배열이 주어졌을 때, 배열의 모든 부분 집합을 출력하는 코드를 작성하세요
//입력 예시: nums = [1, 2, 3]
//출력 예시: [[], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]]
//이 문제 chatgpt가 다 해줬어요...

public class 모든부분집합구하기 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
        public static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, i + 1, current, result);
            current.remove(current.size() - 1);
            }
        }


        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            List<List<Integer>> subsets = subsets(nums);
            System.out.println(subsets);
        }
}

