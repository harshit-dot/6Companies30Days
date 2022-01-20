class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        Stack<Integer> s=new Stack<Integer>();
        ArrayList<Integer> lst=new ArrayList<>();
        lst.add(arr[n-1]);
        s.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            int k=s.peek();
            if(arr[i]>=k){
                lst.add(arr[i]);
                s.push(arr[i]);
            }
        }
        Collections.reverse(lst);
        return lst;
    }
}
