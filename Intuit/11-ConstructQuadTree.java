class Solution {
    public Node construct(int[][] grid) {
        int n = grid.length;
        Node root = null;
        if (n == 0)
            return root;
        else if (n == 1) {
            root = new Node(grid[0][0] == 0 ? false : true, true);
        } else if (allValSame(grid, 0, 0, n-1, n-1)) {
            root = new Node(grid[0][0] == 0 ? false : true, true);
        } else {
            root = new Node();
            buildTree(root, grid, n, 0, 0, n-1, n-1);
        }
        return root;
    }
    
    public void buildTree(Node root, int[][]grid, int n, int sr, int sc, int er, int ec) {     
        if (n == 1) {
            root.topLeft = root.topRight = root.bottomLeft = root.bottomRight = null;
            return;
        }
        n = n / 2;
        if (allValSame(grid, sr, sc, sr+n-1, sc+n-1)) {
            root.topLeft = new Node(grid[sr][sc] == 0 ? false : true, true);
        } else {
            root.topLeft = new Node();
            buildTree(root.topLeft, grid, n, sr, sc, sr+n-1, sc+n-1);
        }
        if (allValSame(grid, sr, sc+n, sr+n-1, ec)) {
            root.topRight = new Node(grid[sr][sc+n] == 0 ? false : true, true);
        } else {
            root.topRight = new Node();
            buildTree(root.topRight, grid, n, sr, sc+n, sr+n-1, ec);
        }
        if (allValSame(grid, sr+n, sc, er, sc+n-1)) {
            root.bottomLeft = new Node(grid[sr+n][sc] == 0 ? false : true, true);
        } else {
            root.bottomLeft = new Node();
            buildTree(root.bottomLeft, grid, n, sr+n, sc, er, sc+n-1);
        }
        if (allValSame(grid, sr+n, sc+n, er, ec)) {
            root.bottomRight = new Node(grid[sr+n][sc+n] == 0 ? false : true, true);
        } else {
            root.bottomRight = new Node();
            buildTree(root.bottomRight, grid, n, sr+n, sc+n, er, ec);
        }   
    }
    
    public boolean  allValSame(int[][] grid, int sr, int sc, int er, int ec) {
        int val = grid[sr][sc];
        boolean same = true;
        for (int i = sr; i <= er; i++) {
            for (int j = sc; j <= ec; j++) {
                if (grid[i][j] != val) {
                    same = false;
                    break;
                }
            }
        }
        return same;
    }
}