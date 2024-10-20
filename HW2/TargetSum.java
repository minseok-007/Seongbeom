package HW2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TargetSum {
    public static void main(String[] args) {
        int[] numbers = {2,4,3,5,7,8,-1};
        int target = 7;
        List<int[]> list = findPairs(numbers, target);
        for (int[] arr : list) {
            System.out.println(arr[0] + ", " + arr[1]);
        }
    }

    public static List<int[]> findPairs(int[] numbers, int target) {
        List<int[]> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<String> uniquePair = new HashSet<>();

        for (int number : numbers) {
            int a = target - number;
            if (set.contains(a)) {
                int[] pair = new int[] {Math.min(number, a), Math.max(number, a)};
                String s = pair[0] + ","+pair[1];
                if (!uniquePair.contains(s)) {
                    uniquePair.add(s);
                    result.add(pair);
                }
            }
            set.add(number);
        }
        return result;
    }
}
