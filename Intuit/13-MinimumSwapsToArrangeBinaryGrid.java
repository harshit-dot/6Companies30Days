class Solution 
{
    public int minSwaps(int[][] grid) 
    {
        int len = grid.length;
        int swap = 0;
        int[] preProcess = new int[len];
        for(int i = 0; i < len; i++)
        {
            preProcess[i] = countRightZeros(grid[i]);
        }
        for(int i = 0; i < len; i++)
        {
            int minValueRequired = len - i - 1;
            
            int j = i;
            while(j < len && preProcess[j] < minValueRequired)
            {
                j++;
            }
            
            if(j == len)
                return -1;
            
            while(j != i)
            {
                swap++;
                int temp = preProcess[j];
                preProcess[j] = preProcess[j-1];
                preProcess[j-1] = temp;
                j--;
            }
        }
        
        return swap;
    }
    
    private int countRightZeros(int[] row)
    {
        int cnt = 0;
        for(int i = row.length - 1; i >= 0; i--)
        {
            if(row[i] != 0)
                break;
            cnt++;
        }
        
        return cnt;
    }
}