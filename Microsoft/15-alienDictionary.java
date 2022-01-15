class Solution
{
    String str="";
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> lst=new ArrayList<>();
        ArrayList<ArrayList<Integer>> lst1=new ArrayList<>();

        for(int i=0;i<K;i++){
            lst.add(i,new ArrayList<Integer>());
            lst1.add(i, new ArrayList<Integer>());
        }
        for(int i=0;i<dict.length-1;i++){
            String s1=dict[i];
            String s2=dict[i+1];
            int n=s1.length();
            int m=s2.length();
            int ii=0;
            int j=0;
            while(ii<n && j<m){
                if(s1.charAt(ii)!=s2.charAt(j)){
                    lst.get(s1.charAt(ii)-97).add(s2.charAt(j)-97);
                    lst1.get(s2.charAt(j)-97).add(s1.charAt(ii)-97);
                }
                ii=ii+1;
                j=j+1;
                
            }
            
            
        }
       
        Stack<Integer> s=new Stack<>();
        boolean[] arr=new boolean[K];
        for(int i=0;i<K;i++){
            if(arr[i]!=true){
                dfs1(i, s,arr, lst);
            }
        }
        for(int i=0;i<K;i++){
            arr[i]=false;
        }
        
        while(!s.isEmpty()){
            int p=s.pop();
            if(arr[p]==false){
                dfs(p,lst1,arr);
            }
        }
        // System.out.println(str);
       return str;
        
        
        
    }
    void dfs(int x, ArrayList<ArrayList<Integer>> lst, boolean[] arr){
        arr[x]=true;
        str+=(char)(x+97);
        for(int i=0;i<lst.get(x).size();i++){
            if(arr[lst.get(x).get(i)]!=true){
                dfs(lst.get(x).get(i), lst, arr);
            }
        }
    }
    void dfs1(int x, Stack<Integer> s, boolean[] arr, ArrayList<ArrayList<Integer>> lst){
        arr[x]=true;
        for(int i=0;i< lst.get(x).size();i++){
            if(arr[lst.get(x).get(i)]!=true){
                dfs1(lst.get(x).get(i), s,arr,lst);
            }
        }
        s.push(x);
    }
    
}
