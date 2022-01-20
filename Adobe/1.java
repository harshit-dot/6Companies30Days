class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> lst =new ArrayList<>();
        int sum=0;
        int j=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];

            while(sum>s &&j<i ){
                sum=sum-arr[j];
                j++;
            }
            if(sum==s){
                lst.add(j+1);
                lst.add(i+1);
                return lst;
            }
        }
        lst.add(-1);
        return lst;
        
    }
}

