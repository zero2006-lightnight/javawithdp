public class SpaceEfficient {
    static int fibS(int n)
    {
        int prev2 = 0;
        int prev1 = 1;  
        for(int i=2;i<=n;i++)
        {
            int curr = prev2+prev1;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    static int tribS(int n)
    {
        int prev3 = 0;
        int prev2 = 1;
        int prev1 = 1;  
        for(int i=3;i<=n;i++)
        {
            int curr = prev3+prev2+prev1;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int ans = fibS(2);
        System.out.println(ans);
        int ans1 = tribS(9);
        System.out.println(ans1);
    }
}
