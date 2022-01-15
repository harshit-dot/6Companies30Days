class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    static class pair{
        int n,m;
        pair(int n, int m){
            this.n=n;
            this.m=m;
            
        }
    }
    public static int[] calculateSpan(int arr[], int n)
    {
        // Your code here
        int[] ans=new int[n];
        Stack<pair> s=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                ans[i]=1;
            }
            else{
                while(!s.isEmpty() && s.peek().n<=arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=i+1;
                }
                else{
                    ans[i]=i-s.peek().m;
                }
            }
            s.push(new pair(arr[i], i));
            
        }
        return ans;
    }
    
}