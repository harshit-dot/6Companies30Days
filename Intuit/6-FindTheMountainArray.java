class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
       int n= mountainArr.length();
        System.out.println(n);
       int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        int peak=low;
        System.out.println(peak);
        int k=binarySearch(mountainArr,0, peak, target, false);
        if(k!=-1){
            return k;
        }
        int kk=binarySearch(mountainArr, peak+1,n-1, target,true);
        return kk;
    }
    int binarySearch(MountainArray mountainArr, int low, int high, int target, boolean asc){
         while(low<=high){
            int mid=(low+high)/2;
             int ind=mountainArr.get(mid);
             if(ind==target){
                 // System.out.println("hgyd");
                 return mid;
             }
             else{
            if(ind<target){
                if(asc){
                    high=mid-1;
                }
                else{
                low=mid+1;
                }
            }
            else{
                if(asc){
                    low=mid+1;
                }
                else{
                high=mid-1;
                }
            }
             }
        }
        return -1;
    }
}