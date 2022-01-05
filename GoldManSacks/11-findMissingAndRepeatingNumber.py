class Solution:
    def findTwoElement( self,arr, n): 
        # code here
        sm=0
        b=0
        for i in range(0,n):
            sm=sm+abs(arr[i])
            if(arr[abs(arr[i])-1]<0):
                b=abs(arr[i])
            
            else:
                arr[abs(arr[i])-1]=-arr[abs(arr[i])-1]
            
        
        a=(n*(n+1))//2-sm+b
        
        return [b,a]