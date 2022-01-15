class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        return solve(arr, n, dp);
        
    }
    int solve(int[] arr, int n, int[] dp){
        if(n<=0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=Math.max(arr[n-1]+solve(arr, n-2, dp),solve(arr, n-1, dp));
    }
}