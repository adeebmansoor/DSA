public class backtrackingNQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueen(board, 0));
    }

    static int nQueen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }


        int count = 0;
        // Placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // Place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueen(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Left Diagonal
            int maxLeft = Math.min(row, col);
            for (int j = 1; j <= maxLeft; j++) {
                if (board[row-j][col-j]) {
                    return false;
                }
            }

            // Right Diagonal
            int maxRight = Math.min(row, board.length - col - 1);
            for (int j = 1; j <= maxRight; j++) {
                if (board[row-j][col+j]) {
                    return false;
                }
            }
        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
