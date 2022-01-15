class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        ArrayList<String> lst=new ArrayList<>();
        Map<Integer, String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        solve(map,a,N, lst,"",0);
        return lst;


        
    }
    static void solve(Map<Integer, String> map, int[] arr, int n, ArrayList<String> lst, String ans, int index){
        if(ans.length()==n){
            lst.add(ans);
            return;
        }
        for(int i=index;i<n;i++){
            String p=map.get(arr[i]);
            for(int j=0;j<p.length();j++){
                solve(map, arr, n, lst, ans+p.charAt(j), i+1);
            }
        }
    }
}