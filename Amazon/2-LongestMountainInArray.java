class Solution {
    public int longestMountain(int[] arr) {
         int i = 1;int prev = arr[0];int sum = 0;
            int len = arr.length;
            while(i<arr.length){
                if(arr[i]==prev){
                    i++ ; continue;
                }
                int inc =0, dec = 0;
                while(i<len && arr[i]>prev){
                   prev = arr[i];
                    i++;inc++;
                }
                while(i< len && arr[i]<prev){
                    prev = arr[i];
                    i++;dec++; 
                }
                if(inc>0 && dec>0){
                    sum = Math.max(sum, inc+dec+1);
                }
            }
         return sum;   
        
    }
}
