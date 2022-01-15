class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum=0;
	    for(int i=0;i<n;i++){
	        sum=sum+arr[i];
	    }
	    boolean[][] dp=new boolean[n+1][sum+1];

	    for(int i=0;i<n+1;i++){
	        for(int j=0;j<sum+1;j++){
	            if(i==0){
	                dp[i][j]=false;
	            }
	            if(j==0){
	                dp[i][j]=true;
	            }
	        }
	    }
	    for(int i=1;i<n+1;i++){
	        for(int j=1;j<sum+1;j++){
	            
	           
	                if(j>=arr[i-1]){
	                    dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
	                }
	                else{
	                    dp[i][j]=dp[i-1][j];
	                }
	            
	           }
	    }
	    int diff=Integer.MAX_VALUE;
	    for(int i=0;i<=sum/2;i++){
	        if(dp[n][i]==true){
	            diff=Math.abs((2*i)-sum);
	        }
	    }
	    return diff;
	    
	} 
}
