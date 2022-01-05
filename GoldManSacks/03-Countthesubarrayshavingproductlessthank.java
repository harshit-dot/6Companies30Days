class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
     int i=0;
     int j=0;
     long pro=1;
     int ans=0;
     while(i<n){
         pro=pro*a[i];
         while(j<=i && pro>=k){
             pro=(long)(pro/a[j]);
             j++;
         }
         ans=ans+(int)(i-j+1);
         i++;
     }
     return ans;
    }
}