class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
       ArrayList<Integer> list = new ArrayList<>();
       Deque<Integer> dq = new LinkedList<>();
       int i = 0;
       for (;i<k;i++){
           while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
               dq.removeLast();
           }
           dq.addLast(i);
       }
       
       for(;i<n;i++){
           int x = arr[dq.peek()];
           list.add(x);
           while(!dq.isEmpty() && dq.peek()<=i-k){
               dq.removeFirst();
           }
           while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
               dq.removeLast();
           }
           dq.addLast(i);
       }
       
       int x = arr[dq.peek()];
       list.add(x);
       return list;
    }
}