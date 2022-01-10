class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> lst=new ArrayList<>();
        int max=0;
        for(int i=0;i<k;i++){
            q.add(arr[i]);
        if(max< arr[i]){
            max=arr[i];
        }
        }
        lst.add(max);
        int j=0;
        for(int i=k;i<n;i++){
            q.remove(arr[j]);
            j++;
            q.add(arr[i]);
            lst.add(q.peek());
        }
        return lst;
    }
}