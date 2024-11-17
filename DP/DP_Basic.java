package DP;

import java.util.HashMap;

public class DP_Basic {
    // dp: 문제를 작은 문제 (sub problem)으로 나누고, 각 sub problem 의 결과를 저장하여 "중복 계산"을 피하는 최적화 기법

    // bottom up
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n ;i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // dp[2] = dp[1] + dp[0] = 1
        // dp[3] = dp[2] + dp[1]
        return dp[n];
    }

    private static HashMap<Integer, Integer> memo = new HashMap<>();
    //top down (Recursion)
    public static int fib2(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
