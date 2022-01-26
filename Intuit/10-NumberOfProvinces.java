class Solution {
    public int findCircleNum(int[][] arr) {
        List<ArrayList<Integer>> lst=new ArrayList<>();
        int n=arr.length;
        boolean[] boo=new boolean[n];
        for(int i=0;i<n;i++){
            lst.add(i, new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    lst.get(i).add(j);
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(boo[i]!=true){
                ans++;
                solve(i,lst, boo);
            }
        }
        return ans;
    }
    
    void solve(int x, List<ArrayList<Integer>> lst , boolean[] boo){
        boo[x]=true;
        for(int i=0;i<lst.get(x).size();i++){
            if(boo[lst.get(x).get(i)]!=true){
                solve(lst.get(x).get(i), lst, boo);
            }
        }
    }
}