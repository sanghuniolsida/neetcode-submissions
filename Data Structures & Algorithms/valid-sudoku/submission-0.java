class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // 1. 행 검사
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                
                if (ch == '.') continue;
                
                if (set.contains(ch)) {
                    return false;
                }
                
                set.add(ch);
            }
        }
        
        // 2. 열 검사
        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<>();
            
            for (int i = 0; i < 9; i++) {
                char ch = board[i][j];
                
                if (ch == '.') continue;
                
                if (set.contains(ch)) {
                    return false;
                }
                
                set.add(ch);
            }
        }
        
        // 3. 3x3 박스 검사
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                
                Set<Character> set = new HashSet<>();
                
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        char ch = board[i][j];
                        
                        if (ch == '.') continue;
                        
                        if (set.contains(ch)) {
                            return false;
                        }
                        
                        set.add(ch);
                    }
                }
            }
        }
        
        return true;
    }
}