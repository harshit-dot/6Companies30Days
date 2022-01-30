class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
      int[][] arr = new int[n][2];
        
      for(int i=0; i<n;i++){
          arr[i]=new int[] {efficiency[i], speed[i]};
      }
        
      Arrays.sort(arr,(a,b)->b[0]-a[0]);
      PriorityQueue<Integer> q=new PriorityQueue<>(k,(a, b)-> a-b);
      long result=Long.MIN_VALUE;
      long totalSpeed=0;
     
    for(int[] i : arr) {
        if(q.size() == k)
            totalSpeed = totalSpeed - q.poll();  
            q.add(i[1]);
            totalSpeed = totalSpeed + i[1];
	        result=Math.max(result, totalSpeed*i[0]);
        }
        return (int)(result%1000000007);
    }
}