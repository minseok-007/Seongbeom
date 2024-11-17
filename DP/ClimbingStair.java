package DP;

public class ClimbingStair {

    // 4

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1; // 계단 0칸
        dp[1] = 1; // 계단 1칸



        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int result = climbStairs(n);
        System.out.println(result);
    }


}
