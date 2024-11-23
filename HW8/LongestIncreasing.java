package HW8;
//문제: 배열에서 길이가 가장 긴 증가하는 부분 수열의 길이를 구하라.
//입력: [10, 9, 2, 5, 3, 7, 101, 18]
//출력: 4 (부분 수열: [2, 3, 7, 101])

import java.util.Arrays;

public class LongestIncreasing {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int length = lengthOfLIS(nums);
        System.out.println(length);
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int maxLength = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }
}
