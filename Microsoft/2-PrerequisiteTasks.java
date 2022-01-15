class Solution {
    public boolean isPossible(int N, int[][] pre)
    {
        // Your Code goes here
        int[] arr=new int[N];
        ArrayList<ArrayList<Integer>> lst=new ArrayList<>();
        for(int i=0;i<N;i++){
            lst.add(i, new ArrayList<Integer>());
        }
        for(int i=0;i<pre.length;i++){
            lst.get(pre[i][0]).add(pre[i][1]);
        }
        for(int i=0;i<N;i++){
            arr[i]=-1;
        }
        for(int i=0;i<N;i++){
            if(arr[i]==-1){
                if(dfs(i, lst, arr)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean dfs(int x, ArrayList<ArrayList<Integer>> lst, int[] arr){
        if(arr[x]==0){
            return true;
        }
        arr[x]=0;
        for(int i=0;i<lst.get(x).size();i++){
            if(arr[lst.get(x).get(i)]==0 || arr[lst.get(x).get(i)]==-1){
                if(dfs(lst.get(x).get(i), lst, arr)){
                    return true;
                }
            }
        }
        arr[x]=1;
        return false;
    }
    
}