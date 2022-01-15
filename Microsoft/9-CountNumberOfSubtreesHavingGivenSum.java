class Tree
{
    //Function to count number of subtrees having sum equal to given sum.
 class INT
{
    int v;
    INT(int a)
    {
        v = a;
    }
}
    int countSubtreesWithSumX(Node root, int X)
    {
	//Add your code here.
	if(root==null){
	    return 0;
	}
	INT count=new INT(0);
	int ls=sumx( root.left, X, count);
    int rs=sumx( root.right,X, count);
	int sum=ls+rs+root.data;
	if(sum==X){
	    count.v++;
	}
	return count.v;

    }
    int sumx(Node root, int x, INT count){
        if(root==null){
            return 0;
        }
        int ls=sumx(root.left, x, count);
        int rs=sumx(root.right, x, count);
        int sum=ls+rs+root.data;
        if(sum==x){
            count.v++;
        }
        return sum;
        
    }
    
}

