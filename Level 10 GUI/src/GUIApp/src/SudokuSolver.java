package GUIApp.src;

public class SudokuSolver {

    public static final int GRID_SIZE = 9;

    public boolean isNumberInRow(int[][] board, int number, int row){
        for (int i = 0; i < GRID_SIZE; i++){
           if(board[row][i] == number) {
               return true;
           }
        }
        return false;
    }

    public boolean isNumberInCol(int[][] board, int number, int col){
        for (int i = 0; i < GRID_SIZE; i++){
            if(board[i][col] == number) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumberInBox(int[][] board, int number, int row, int col){
        int startFromRow = row - row % 3;
        int startFromCol = col - col % 3;

        for (int i = startFromRow; i < startFromRow + 3; i++){
            for (int j = startFromCol; j < startFromCol + 3; j++){
                if(board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isValidPlacement(int[][] board, int number, int row, int col){
        return !isNumberInRow(board, number, row) &&
                !isNumberInCol(board, number, col) &&
                !isNumberInBox(board, number, row, col);
    }

    public boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row ++){
            for (int col = 0; col < GRID_SIZE; col++){
                if (board[row][col] == 0){
                    for (int numToTry = 1; numToTry <= GRID_SIZE; numToTry++){
                        if (isValidPlacement(board, numToTry, row, col)){
                            board[row][col] = numToTry;

                            if (solveBoard(board)){
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void displayBoard(int[][] board){
        for (int i = 0; i < GRID_SIZE; i++){
            if (i % 3 == 0 && i != 0){
                System.out.println("------------");
            }
            for (int j = 0; j < GRID_SIZE; j++){
                if (j % 3 == 0){
                    System.out.print("|");
                }
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

}
