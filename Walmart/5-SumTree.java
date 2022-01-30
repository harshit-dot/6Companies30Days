/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

class Solution{
    public void toSumTree(Node root){
         //add code here.
         solve(root);
         
    }
    int solve(Node root){
        if(root==null){
             return 0;
         }
         int a=solve(root.left);
         int b=solve(root.right);
         int x=root.data;
         root.data=a+b;
         return a+b+x;
    }
}