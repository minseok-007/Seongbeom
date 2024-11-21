package HW8;
//주어진 무게 제한과 물건 목록에서, 최대 가치를 가지는 조합을 찾으라.
//입력: 무게 제한 ￼, 아이템 = [(value: 60, weight: 2), (value: 100, weight: 3)]
//출력: 160

import java.util.*;

public class KnapsackProblem {
    public static void main(String[] args) {
        int weightLimit = 5;
        int[][] items = {
                {60, 2},
                {100, 3}
        };

        int maxValue = knapsack(weightLimit, items);
        System.out.println("최대 가치: " + maxValue);
    }

    public static int knapsack(int weightLimit, int[][] items) {
        int n = items.length;
        int[][] dp = new int[n + 1][weightLimit + 1];

        for (int i = 1; i <= n; i++) {
            int value = items[i - 1][0];
            int weight = items[i - 1][1];

            for (int w = 0; w <= weightLimit; w++) {
                if (weight > w) {
                    dp[i][w] = dp[i - 1][w];
                } else {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weight] + value);
                }
            }
        }

        return dp[n][weightLimit];
    }
}

