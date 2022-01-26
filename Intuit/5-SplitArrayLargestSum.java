class Solution {
    public int splitArray(int[] nums, int m) {
        int max=0;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=(low+(high))/2;
            if(isSafe(nums, mid, m)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
    }
    boolean isSafe(int[] nums, int k, int m){
        int count=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>k){
                sum=nums[i];
                count++;
            }
        }
        if(count<=m){
            return true;
        }
        return false;
    }
}
