class Solution{ 
private int m;
    private int n;
    private int totalFreshOranges = 0;
    
    public int orangesRotting(int[][] grid) {
        
        m = grid.length;
        n = grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
			
                if (grid[i][j] == 2) {    
                    queue.add(new int[] { i, j, 0 });
                }
                
                if (grid[i][j] == 1) {
                    totalFreshOranges++;
                }
            }
        }
        
        int minNumberOfMinutes = bfs(queue, grid);
        return totalFreshOranges > 0 ? -1 : minNumberOfMinutes;
    }
    
    private int bfs(Queue<int[]> queue, int[][] grid) {
        
        int maxLevel = 0;
        
        while (!queue.isEmpty()) {
            
            int[] q = queue.poll();
            
            int i = q[0];
            int j = q[1];
            int currentLevel = q[2];
       
            if (grid[i][j] == -1) {
                continue;
            }
            
            if (grid[i][j] == 1) {
                totalFreshOranges--;
            }
            
            grid[i][j] = -1;
            
            maxLevel = Math.max(maxLevel, currentLevel);
            
            if (isValid(i + 1, j) && grid[i + 1][j] == 1) {
                queue.add(new int[] { i+1, j, currentLevel + 1 });
            }
            
            if (isValid(i - 1, j) && grid[i - 1][j] == 1) {
                queue.add(new int[] { i-1, j, currentLevel + 1});
            }
            
            if (isValid(i, j + 1) && grid[i][j + 1] == 1) {
                queue.add(new int[] { i, j+1, currentLevel + 1});
            }
            
            if (isValid(i, j - 1) && grid[i][j - 1] == 1) {
                queue.add(new int[] { i, j-1, currentLevel + 1});
            }
        }
        
        return maxLevel;
    }
    
    private boolean isValid(int i, int j) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}
