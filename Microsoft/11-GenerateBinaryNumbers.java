class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> lst=new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        q.add("1");
        int ans=0;
        
        while(true){
            int s=0;
            int n=q.size();
            for(int i=0;i<n;i++){
               String k=q.remove();
               ans++;
               
               lst.add(k);
               if(ans==N){
                   s=1;
                   break;
               }
               
                q.add(k+"0");
                
                q.add(k+"1");
            }
            if(s==1){
                break;
            }
            
            
        }
        return lst;
    }
    
}


