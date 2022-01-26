class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        if(h==piles.length){
            return max;
        }
        int lo=0;
        int hi=max;
        int ans=Integer.MAX_VALUE;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isSafe(piles,mid,h )){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    boolean isSafe(int[] piles, int a, int h){
        int k=0;
        for(int i=0;i<piles.length;i++){
            k=k+(int)(Math.ceil((piles[i]*1.0)/a));
        }
        if(k<=h){
            return true;
        }
        return false;
    }
}