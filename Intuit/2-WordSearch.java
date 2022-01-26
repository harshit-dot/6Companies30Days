
class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean[][] arr=new boolean[board.length][board[0].length];

                    boolean k=count(i,j,board,word,0, arr);
                    if(k==true){
                        return true;
                    }
                    
                }
            }
        }
        return false;
    }
    boolean  count(int row, int col, char[][] board, String word , int pos, boolean[][] arr){
        if(row<0 || col<0 || row>=board.length || col>=board[0].length ){
            return false;
        }
        
         if(pos==word.length()){
            return true;
        }
        if(board[row][col]!=word.charAt(pos)){
            return false;
        }
       
        if(arr[row][col]==true){
            return false;
        }
        
        
        pos=pos+1;
        arr[row][col]=true;
        if(count(row+1,col,board, word, pos, arr) || count(row, col+1, board, word, pos, arr) || count(row-1, col, board, word, pos, arr) || count(row, col-1, board, word, pos, arr)){
          return true;        
        }
       
        
        return false;
    }
}