package DP;

public class ClimbingStairWithCost {

    // 각 계단을 오르는데 cost[] 배열이 주어졌을 때, 마지막 계단을 넘을 때까지 최소 비용으로 계단을 오르는 방법 계산하기
    // 한번에 한계단 또는 두 계단만 오를 수 있음.

    //cost = [10, 15, 20]

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }
    private static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n == 1) return cost[0];

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        // 10번째 칸
        // 8번째랑 9번째
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }
}
