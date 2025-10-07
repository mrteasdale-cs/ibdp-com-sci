public class XandO {
    char[][] board = new char[3][3]; //global
    char currentPlayer = 'X';

    public XandO(){

    }

    public void makeMove(int row, int col){
        if(isValid(row, col)){
            board[row][col] = currentPlayer;
        } else {
            System.out.println("Invalid move!");
        }
    }

    public void initialiseBoard(){
        //generate a 2d array
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard(){
        //System.out.println(" 0 1 2");
        for(int i = 0; i < 3; i++){
            if (i > 0) System.out.println("-+-+-");
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
        }
    }

    private boolean isValid(int row, int col){
        return row >= 0 && row < 3 && col >= 0 && col < 3
                && board[row][col] == ' ';
    }

    public void switchPlayer(){
        if(currentPlayer == 'X'){
            currentPlayer = 'O';
        } else{
            currentPlayer = 'X';
        }
    }


}
