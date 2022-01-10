class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        Node root=head;
        int i=0;
        while(root!=null){
            
            i++;
            if(i%M==0){
                Node temp=root;
                int j=0;
                while(j<=N && temp!=null){
                    temp=temp.next;
                    j++;
                }
                root.next=temp;
                
            }
            root=root.next;
        }
       
    }
}


