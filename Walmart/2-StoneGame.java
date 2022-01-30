class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int[][] dp=new int[n][n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=piles[i];
        }
        for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 dp[i][j]=-1;
           }
        }
        int k= solve(piles,0,n-1, dp);
        if(sum-k>k){
            return false;
        }
        return true;
        
    }
    int solve(int[] arr, int i, int j, int[][] dp){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=Math.max(arr[i]+Math.min(solve(arr, i+2,j,dp),solve(arr, i+1, j-1,dp)), arr[j]+Math.min(solve(arr, i+1,j-1, dp), solve(arr, i,j-2, dp)));
    }
}
