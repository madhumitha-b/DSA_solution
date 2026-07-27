class Solution {

    boolean recursion(int row, int col, int index, 
                      char[][] board, String word) {

        // All characters matched
        if (index == word.length()) {
            return true;
        }

        // Out of bounds
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return false;
        }

        // Current character doesn't match
        if (board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark as visited
        char temp = board[row][col];
        board[row][col] = '#';

        // Explore all 4 directions
        boolean found = 
            recursion(row + 1, col, index + 1, board, word) ||
            recursion(row - 1, col, index + 1, board, word) ||
            recursion(row, col + 1, index + 1, board, word) ||
            recursion(row, col - 1, index + 1, board, word);

        // Backtrack
        board[row][col] = temp;

        return found;
    }

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (recursion(i, j, 0, board, word)) {
                    return true;
                }
            }
        }

        return false;
    }
}