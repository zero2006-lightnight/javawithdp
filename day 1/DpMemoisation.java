import java.util.Arrays;

public class DpMemoisation
{
    static int[] dp;
    static int[] dp1;
    static int fibD(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        dp[n] = fibD(n-1)+fibD(n-2);
        return dp[n];
    }
    static int tribD(int n)
    {
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        if(dp1[n]!=-1)
            return dp1[n];
        dp1[n] = tribD(n-1)+tribD(n-2)+tribD(n-3);
        return dp1[n];
    }
    public static void main(String[] args) {
        dp = new int[8];
        Arrays.fill(dp, -1);
        int ans = fibD(5);
        System.out.println(ans);
         dp1 = new int[80];
        Arrays.fill(dp1, -1);
        int ans1 = tribD(9);
        System.out.println(ans1);
    }
}