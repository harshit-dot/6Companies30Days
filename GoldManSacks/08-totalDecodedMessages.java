class Solution
{
    public int CountWays(String str)
    {
        // code here
        int n=str.length();
        long dp[] = new long[n + 1]; 
        dp[0] = 1;
        dp[1] = 1;
        if(str.charAt(0)=='0')  
              return 0;
         for (int i = 2; i <= n; i++)
        {
            dp[i] = 0;

       
            if (str.charAt(i-1) > '0'){
                 dp[i] = dp[i - 1];
            }

       
            if (str.charAt(i-2) == '1' || (str.charAt(i-2) == '2' && str.charAt(i-1) < '7')){
                dp[i] =((dp[i]%1000000007) +(dp[i - 2]%1000000007))%1000000007;
                }
    }
    return (int)(dp[n]%1000000007);
        
    }
}