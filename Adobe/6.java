class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> lst=new ArrayList<>();
        solve(n,lst, 0,0, "");
        return lst;
    }
    void solve(int n, List<String> lst, int open , int clo, String ans){
        if(ans.length()==2*n){
            lst.add(ans);
            return;
        }
        if(open<n){
            solve(n, lst, open+1,clo,ans+"(");
        }
        if(clo<open){
            solve(n,lst, open, clo+1, ans+")");
        }
    }
    
}

