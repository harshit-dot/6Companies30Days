class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int ans=solve(grid, i,j,n,m);
                    if(max<ans){
                        max=ans;
                    }
                }
            }
        }
        return max;
    }
    int solve(int[][] grid, int row, int col, int n, int m){
        if(row<0 || col<0 || row>=n || col>=m){
            return 0;
        }
      
        
        if(grid[row][col]==0){
            return 0;
        }
        int k=1;
        grid[row][col]=0;
        for(int i=row-1;i<row+2;i++){
            for(int j=col-1;j<col+2;j++){
                    if(i!=row || j!=col){
                        
                            k=k+solve(grid, i, j, n, m);
                        }
                        
                    
                }
            
        }
        return k;
        
    }
}