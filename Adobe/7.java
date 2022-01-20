class GfG
{
	public static int maxCoins(int A[],int n)
	{
          //add code here.
          int[][] dp=new int[n+1][n+1];
          for(int i=0;i<n+1;i++){
              for(int j=0;j<n+1;j++){
                  dp[i][j]=-1;
              }
          }
          return solve(A,0, n, dp);
          
    }
    public static int solve(int[] arr, int start, int n, int[][] dp){
        if(start>=n){
            return 0;
        }
        if(dp[start][n]!=-1){
            return dp[start][n];
        }
        return dp[start][n]= Math.max(arr[start]+Math.min(solve(arr, start+2, n, dp), solve(arr, start+1, n-1,dp)), arr[n-1]+Math.min(solve(arr, start+1, n-1,dp), solve(arr, start,n-2,dp)));
    }
}

