public class MinimumFallingPath{
public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        System.arraycopy(matrix[0], 0, dp[0], 0, n);
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {

                int up = dp[i-1][j];

                int leftDiagonal = (j > 0) ? dp[i-1][j-1] : Integer.MAX_VALUE;
                int rightDiagonal = (j < n-1) ? dp[i-1][j+1] : Integer.MAX_VALUE;

                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }
        int min = Integer.MAX_VALUE;

        for(int j = 0; j < n; j++) {
            min = Math.min(min, dp[n-1][j]);
        }

        return min;
    } 
    public static void main(String[] args) {
        MinimumFallingPath obj = new MinimumFallingPath();

        int[][] matrix = {
            {2, 1, 3},
            {6, 5, 4},
            {7, 8, 9}
        }; 
        int result = obj.minFallingPathSum(matrix);

        System.out.println("Minimum falling path sum: " + result);
    }
    
}
