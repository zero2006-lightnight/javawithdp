public class EqualPartition {
     static boolean equalPartition(int[] nums, int T){
        int n = nums.length;
        boolean[][] dp = new boolean[n+1][T+1];
        for(int i=0; i<=n; i++) {
            dp[i][0] = true;
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=T; j++) {
                   if(nums[i-1] <= j)
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][T];
    }
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        if(sum % 2 == 1) {
            System.out.println(false);
            System.exit(0);
        } 
            boolean ans = equalPartition(nums, sum / 2);
            System.out.println(ans);
    }
}
