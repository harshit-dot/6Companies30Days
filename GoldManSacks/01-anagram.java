
class Solution {
    
    public List<List<String>> Anagrams(String[] s) {
        // Code here
       int n=s.length;
       boolean[] boo=new boolean[n];
       
       List<List<String>> lst1=new ArrayList<>();
       List<String> lst2=new ArrayList<>();
       for(int i=0;i<n;i++){
           char[] arr=s[i].toCharArray();
           Arrays.sort(arr);
           String str="";
           for(int j=0;j<arr.length;j++){
               str=str+arr[j];
           }
           lst2.add(str);
       }
       for(int i=0;i<n;i++){
           if(boo[i]!=true){
           List<String> lst=new ArrayList<>();
           for(int j=0;j<n;j++){
               if(lst2.get(j).equals((lst2.get(i)))){
                   lst.add(s[j]);
                   boo[j]=true;
               }
           }
           lst1.add(new ArrayList(lst));
       }
       }
       
       return lst1;
      
    }
}
