import java.util.Scanner;
//Comment on each section of the code where you see EXPLAIN
public class NoughtsAndCrosses {
    //EXPLAIN:
    private char[][] board = new char[3][3];
    //EXPLAIN:
    public NoughtsAndCrosses() {
        Scanner scan = new Scanner(System.in);
        char currentPlayer = 'X';
        initialiseBoard();  //EXPLAIN:

        while (true) { //EXPLAIN:
            printBoard(); //EXPLAIN:
            System.out.println("Player " + currentPlayer + ", enter row and column (0, 1, or 2):");
            int row = scan.nextInt();
            int col = scan.nextInt();
            //EXPLAIN:
            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                if (checkWin(currentPlayer)) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                } //EXPLAIN:
                if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                //EXPLAIN:
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
        scan.close();
    }

    //EXPLAIN:
    private void initialiseBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';//EXPLAIN:
    }

    //EXPLAIN:
    private void printBoard() {
        System.out.println("  0 1 2"); //EXPLAIN:
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " "); //EXPLAIN:
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print('|');
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    // Check if move is valid
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3
                && board[row][col] == ' ';//EXPLAIN:
    }

    // Check for win condition for a given player
    private boolean checkWin(char player) {
        //EXPLAIN:
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        }
        //EXPLAIN:
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    // Check if board is full
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) //EXPLAIN:
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
}
