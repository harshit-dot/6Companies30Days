class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        int y=0;
        while(i<n){
           
            sum=sum+nums[i];
        
            while(j<=i && sum>=target){
             ans=Math.min(ans, i-j+1);
             sum=sum-nums[j];
             j++;
            }
            
                
            i++;
        }
        
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}