//Game Class - Manages game flow, switching players, asking for input, declaring winner/draw.
import java.util.Scanner;
public class Game {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;
    public Game(){
        this.board = new Board();
        playerX = new Player("Player 1", 'X');
        playerO = new Player ("Player 2", 'O');
        currentPlayer = playerX;
    }//end constructor

    public void start(){
        Scanner input = new Scanner(System.in);
        while (true) {
            // Print the board
            // Output a friendly message
            // Accept 2 inputs (ints)
            board.printBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + "), enter row and column (0, 1, or 2):");
            int row = input.nextInt();
            int col = input.nextInt();
            //check if valid move
            if (board.isValidMove(row, col)) {
                board.setMove(row,col, currentPlayer.getSymbol());
                if (board.checkWin(currentPlayer.getSymbol())) {
                    board.printBoard();
                    System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                    break;
                }
                if (board.isBoardFull()) {
                    board.printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                // Switch player
                if (currentPlayer == playerX) {
                    currentPlayer = playerO;
                } else {
                    currentPlayer = playerX;
                }
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
        input.close();
    }//end game method
}//end class