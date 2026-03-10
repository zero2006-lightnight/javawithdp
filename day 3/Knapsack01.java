public class Knapsack01 {
    static int knapsack01(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int[][] dp = new int[n+1][capacity+1];
        for(int i=1; i<=n; i++) {
            for(int j=0; j<=capacity; j++) {
                   if(weights[i-1] <= j)
                    dp[i][j] = Math.max(values[i-1] + dp[i-1][j-weights[i-1]], dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] values = {1, 10, 6};
        int[] weights = {3, 1, 2};
        int ans = knapsack01(values, weights, 3);
        System.out.println(ans);
    }
}