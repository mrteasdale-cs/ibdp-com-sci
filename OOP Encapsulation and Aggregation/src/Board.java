public class Board {
    //Manages the 3x3 grid: state, checking for full or win, displaying.
    private char[][] board = new char[3][3];

    public Board() {
        initialiseBoard();

    }

    //Create board
    // Set all board positions to empty (2D Grid)
    private void initialiseBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';//empty string
    }

    //set baord method
    public void setMove(int row, int col, char move) {
        board[row][col] = move;
    }

    // Print the current state of the board
    public void printBoard() {
        System.out.println("  0 1 2");//print the index at the top
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");//prints the row index along with a space
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print('|');
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    // Check if move is valid
    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3
                && board[row][col] == ' ';
    }

    // Check for win condition for a given player
    public boolean checkWin(char player) {
        // Check rows and columns (i remains the same to account for all possible rows/cols
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        }
        // Check diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    // Check if board is full
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

}
