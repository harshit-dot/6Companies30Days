class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        // Your code goes here.
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            Node temp=null;
            for(int i=0;i<n;i++){
               Node prev = temp;
                temp = q.poll();
  
                
                if (i > 0)
                    prev.nextRight = temp; 
  
                if (temp.left != null)
                    q.add(temp.left);
  
                if (temp.right != null)
                    q.add(temp.right);
            }
  
            temp.nextRight = null; 
        }
    }
}