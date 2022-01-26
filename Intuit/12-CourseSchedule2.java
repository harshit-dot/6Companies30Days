class Solution {
    public int[] findOrder(int n, int[][] pre) {
        int[] arr=new int[n];
        int[] arr1=new int[n];
        ArrayList<ArrayList<Integer>> lst=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            lst.add(i,new ArrayList<Integer>());
        }
        for(int i=0;i<pre.length;i++){
            lst.get(pre[i][0]).add(pre[i][1]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(dfs(i,arr,lst)){
                    int[] arr3=new int[0];
                    return arr3;
                }
            }
        }
        Stack<Integer> s=new Stack<Integer>();
        boolean[] boo=new boolean[n];
        for(int i=0;i<n;i++){
            if(boo[i]==false){
                dfs1(i,boo,lst,s);
            }
        }
        int i=n-1;
        while(!s.isEmpty()){
            arr1[i]=s.pop();
            i=i-1;
        }
        return arr1;
    }
    boolean dfs(int x, int[] arr, ArrayList<ArrayList<Integer>> lst){
        if(arr[x]==1){
            return true;
        }
        arr[x]=1;
        for(int i=0;i<lst.get(x).size();i++){
            if(arr[lst.get(x).get(i)]==0 || arr[lst.get(x).get(i)]==1){
                if(dfs(lst.get(x).get(i),arr, lst)){
                    return true;
                }
            }
        }
        arr[x]=2;
        return false;
        
    }
     void dfs1(int x, boolean[] arr, ArrayList<ArrayList<Integer>> lst,Stack<Integer> s){
        arr[x]=true;
         
        for(int i=0;i<lst.get(x).size();i++){
            if(arr[lst.get(x).get(i)]==false){
                dfs1(lst.get(x).get(i),arr, lst,s);
            
                }
            }
             s.push(x);

        }
        
    }