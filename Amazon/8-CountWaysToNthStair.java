class Solution
{
    //Function to count number of ways to reach the nth stair 
    //when order does not matter.
    long countWays(int m)
    {
        // your code here
       int[] arr=new int[2];
       arr[0]=1;
       arr[1]=2;
       int[][] dp=new int[3][m+1];
       for(int i=0;i<3;i++){
           for(int j=0;j<m+1;j++){
               if(i==0){
                   dp[i][j]=0;
               }
               if(j==0){
                   dp[i][j]=1;
               }
           }
       }
       for(int i=1;i<3;i++){
           for(int j=1;j<m+1;j++){
               if(arr[i-1]>j){
                   dp[i][j]=dp[i-1][j];
               }
               else{
                   dp[i][j]=dp[i-1][j]+dp[i][j-arr[i-1]];
               }
           }
       }
       return (long)dp[2][m];
    }    
}
