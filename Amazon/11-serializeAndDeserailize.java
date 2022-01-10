class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    //code here
	    if(root==null){
	        return;
	    }
	    serialize(root.left, A);
	    A.add(root.data);
	    serialize(root.right, A);
	}
	
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        //code here
        Node root=solve(A,0, A.size()-1);
        return root;
    
       
        
    }
    public Node solve(ArrayList<Integer> A, int low, int high){
         if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        Node root=new Node(A.get(mid));
        if(low==high){
            return root;
        }
        root.left=solve(A,low, mid-1);
        root.right=solve(A, mid+1, high);
        return root;
    }
}