class Solution {
    public boolean isValidSudoku(char[][] board) {
        // boolean[9][9] -> 9 rows/cols/subs, 9 possible digits (0-8 map to 1-9)
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] sub = new boolean[9][9];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1'; // Map '1'-'9' to 0-8
                    // Calculate 3x3 sub-box index (0-8)
                    int k = (i / 3) * 3 + (j / 3);
                    
                    // If already seen, invalid
                    if (row[i][num] || col[j][num] || sub[k][num]) {
                        return false;
                    }
                    
                    // Mark as seen
                    row[i][num] = true;
                    col[j][num] = true;
                    sub[k][num] = true;
                }
            }
        }
        return true;
    }
}
