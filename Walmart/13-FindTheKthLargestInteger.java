class Solution {
    class compares implements Comparator<String>{
        public int compare(String a, String b){
            if(a.length() > b.length()) return 1;   
            else if(a.length() < b.length()) return -1;
            return a.compareTo(b);
        }
    }
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> q=new PriorityQueue<>(new compares());
        for(int i=0;i<nums.length;i++){
            if(q.size()>k){
                q.poll();
            }
            q.add(nums[i]);

            
        }
        if(q.size()>k){
            q.remove();
        }    
        return String.valueOf(q.peek());
    }
}