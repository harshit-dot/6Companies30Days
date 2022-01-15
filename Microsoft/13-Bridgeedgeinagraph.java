class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
         boolean vis[] = new boolean[V];
        int countInitial=0,countUpdated=0;
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++)
        list.add(new ArrayList<Integer>());
        
        for(int i=0;i<V;i++)
        {
            for(int x:adj.get(i))
            {
                if((i==c && x==d) || (i==d && x==c))
                continue;
                else
                {
                    list.get(i).add(x);
                    list.get(x).add(i);
                }
            }
        }
        
        
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                countInitial++;
                DFS(i,adj,vis);
            }
        }
        
        Arrays.fill(vis,false);
        
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                countUpdated++;
                DFS(i,list,vis);
            }
        }
        
        if(countUpdated>countInitial)// If the number of disconnected components increases
        return 1;                    //after removal of edge(c,d) then graph contains a bridge!
        else 
        return 0;
    }
    
    static void DFS(int cur,ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
        vis[cur]=true;
        for(int x:list.get(cur))
        {
            if(!vis[x])
            DFS(x,list,vis);
        }
    }
}

