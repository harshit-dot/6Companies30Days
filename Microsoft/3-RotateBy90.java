class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        int k=0;
        while(k<n){
            int i=0;
            int j=n-1;
            while(i<j){
            int temp=matrix[i][k];
            matrix[i][k]=matrix[j][k];
            matrix[j][k]=temp;
            i++;
            j--;
        }
        k++;
        }
      
    
    }
}