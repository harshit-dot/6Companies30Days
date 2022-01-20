class Solution
{
    static long numOfWays(int n, int x)
    {
        
        // code here
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=0;i<=n/x;i++){
            int p=(int)Math.pow(i,x);
            lst.add(p);
        }
        long[][] dp=new long[lst.size()+1][n+1];
        for(int i=0;i<lst.size()+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }
        for(int i=1;i<lst.size()+1;i++){
            for(int j=1;j<n+1;j++){
                if(lst.get(i-1)<=j){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-lst.get(i-1)];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        // System.out.println(dp[lst.size()][n]);
        return dp[lst.size()][n];
    }
}

