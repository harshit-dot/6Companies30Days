class Solution
{
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
        //Your code here
        int[][] dp=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                dp[i][j]=-1;
            }
        }
       return  solve(0,0, a,b, dp);
    }
    static  int solve(int start, int end, int n, int m, int[][] dp){
        if(start>=n || end>=m || start<0 || end<0){
            return 0;
        }
        if(start==n-1 && end==m-1){
            return 1;
            
        }
        if(dp[start][end]!=-1){
            return dp[start][end];
        }
        return dp[start][end]=solve(start+1, end, n, m, dp)+solve(start, end+1, n,m, dp);
    }
}