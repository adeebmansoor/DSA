public class backtrackingSudoku {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board, 0, 0);
    }

    static public void solveSudoku(char[][] board, int row, int col) {
        if (row == board.length) {
            display(board);
            return;
        }

        if (col == board.length) {
            solveSudoku(board, row + 1, 0);
            return;
        }

        if (board[row][col] != '.') {
            solveSudoku(board, row, col+1);
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, (char)(i + '0'))) {
                board[row][col] = (char)(i + '0');
                solveSudoku(board, row, col + 1);
                board[row][col] = '.';
            }
        }
        return;
    }

    static boolean isSafe (char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) {
                return false;
            }
        }

        int startRow = row - (row % 3);
        int startCol = col - (col % 3);

        for (int i = startRow;  i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(char[][] board) {
        System.out.print("[");
        for (char[] row : board) {
            System.out.print("[");
            for (char element : row) {
                System.out.print("\""+ element +"\",");
            }
            System.out.println("],");
        }
        System.out.print("]");
    }
}