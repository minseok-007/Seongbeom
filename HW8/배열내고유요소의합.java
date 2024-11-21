package HW8;
//배열에서 중복 없이 나타나는 요소의 합을 구하세요.
//Input: arr = [1, 2, 3, 2, 4, 1]
//Output: 7  // 고유 요소는 [3, 4], 합은 7


import java.util.HashMap;

public class 배열내고유요소의합 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};
        int sum = calculateUniqueElementSum(arr);
        System.out.println(sum);
    }

    public static int calculateUniqueElementSum(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}

