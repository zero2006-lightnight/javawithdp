public class HouseRobber2 {
    private int robLinear(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

   
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] arr1 = new int[nums.length - 1];
        System.arraycopy(nums, 0, arr1, 0, nums.length - 1);

        int[] arr2 = new int[nums.length - 1];
        System.arraycopy(nums, 1, arr2, 0, nums.length - 1);

        return Math.max(robLinear(arr1), robLinear(arr2));
    }
    public static void main(String[] args) {
        HouseRobber2 sol = new HouseRobber2();   
        int[] nums = {1,2,3,1};
        int rob = sol.rob(nums);
        System.out.println(rob);
    }
}

