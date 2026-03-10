public class DpTabulation {
    static int fibDT(int n)
    {
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<=n; i++)
        {
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    static int tribT(int n)
    {
        int[] trib = new int[n+1];
        trib[0] = 0;
        trib[1] = 1;
        trib[2] = 1;
        for(int i=3; i<=n; i++)
        {
            trib[i] = trib[i-1]+trib[i-2]+trib[i-3];
        }
        return trib[n];
    }
    public static void main(String[] args) {
        int ans = fibDT(5);
        System.out.println(ans);
        int ans1 = tribT(9);
        System.out.println(ans1);
    }
}
