class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> lst=new ArrayList<>();
        int up=0;
        int down=r-1;
        int left=0;
        int right=c-1;
        int x=0;
        while(up<=down && left<=right){
            if(x%4==0){
                for(int i=left;i<=right;i++){
                    lst.add(matrix[up][i]);
                    
                }
                up++;
            }
            if(x%4==1){
                for(int i=up;i<=down;i++){
                    lst.add(matrix[i][right]);
                }
                right--;
                
            }
            if(x%4==2){
                for(int i=right;i>=left;i--){
                    lst.add(matrix[down][i]);
                }
                down--;
            }
            if(x%4==3){
                for(int i=down;i>=up;i--){
                    lst.add(matrix[i][left]);
                }
                left++;
            }
            x++;
        }
        return lst;
    }
}
