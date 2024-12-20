package HW7;
import java.util.ArrayList;
import java.util.List;
//정수 배열과 목표 숫자(target)이 주어졌을 때, 배열의 원소를 중복 사용하여 target을 만들 수 있는 모든 조합을 찾으세요.
//입력 예시: candidates = [2, 3, 6, 7] target = 7
//출력 예시: [[2, 2, 3], [7]]
//선생님 chatgpt를 보고도 못하겠어요, 코드가 이해가 안 가요

public class 조합의합 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] candidates, int remain, int start, List<Integer> list, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (remain < 0) { // target value 초과
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], i, list, result); // 같은 숫자를 다시 사용할 수 있음
            list.remove(list.size() - 1); // 백트래킹: 마지막 숫자 제거
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = combinationSum(candidates, target);
        System.out.println(combinations);
    }
}
