
class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String[] ans=new String[2];
        Map<String, Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> m: map.entrySet()){
            if(max<=m.getValue()){
            ans[0]=m.getKey();
            ans[1]=String.valueOf(m.getValue());
            max=m.getValue();
            }
        }
        return ans;
        
    }
}
