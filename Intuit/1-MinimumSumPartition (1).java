class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum=0;
	    for(int i=0;i<n;i++){
	        sum+=arr[i];
	        
	    }
	    int[][] dp=new int[n+1][sum+1];
	    for(int i=0;i<n+1;i++){
	        for(int j=0;j<sum+1;j++){
	            if(i==0){
	                dp[i][j]=0;
	            }
	            if(j==0){
	                dp[i][j]=1;
	            }
	        }
	    }
	    for(int i=1;i<n+1;i++){
	        for(int j=1;j<sum+1;j++){
	            if(arr[i-1]>j){
	                dp[i][j]=dp[i-1][j];
	            }
	            else{
	                dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-arr[i-1]]);
	            }
	        }
	    }
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<=sum/2;i++){
	        if(dp[n][i]==1){
	            if(min>sum-(2*i)){
	                min=sum-(2*i);
	            }
	        }
	    }
	    return min;
	    
	} 
}
