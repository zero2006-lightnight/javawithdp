public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        // If start is obstacle
        if (obstacleGrid[0][0] == 1) return 0;

        dp[0][0] = 1;

        // First column
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 0)
                dp[i][0] = dp[i-1][0];
        }

        // First row
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] == 0)
                dp[0][j] = dp[0][j-1];
        }

        // Fill remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0)
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                else
                    dp[i][j] = 0;
            }
        }

        return dp[m-1][n-1];
     
    }
    public static void main(String[] args) {
        UniquePaths2 obj = new UniquePaths2();

        int[][] obstacleGrid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        }; 
        int result = obj.uniquePathsWithObstacles(obstacleGrid);

        System.out.println("Number of unique paths with obstacles: " + result);
    }
}
