package sudokuGUI;

public class Board {

	private static final int GRID_SIZE = 9;
	private Cell[][] grid;
	
	public Board() {
		grid = new Cell[GRID_SIZE][GRID_SIZE];
		generateBoard();
	}
	
	//
	public void generateBoard() {
		for (int i = 0; i < GRID_SIZE; i++) {
			for (int j = 0; j < GRID_SIZE; j++) {
				grid[i][j] = new Cell(i, j);
			}
		}
	}
	
	public Cell getCell(int row, int col) {
		return grid[row][col];
	}
	
	public int getCellValue(int row, int col) {
		return grid[row][col].getValue();
	}
	
	public void setCellValue(int row, int col, int value) {
		grid[row][col].setValue(value);
	}
	
	// check the rows/cols/diagonals
	public boolean isValidInRow(int row, int value) {
	    for (int col = 0; col < GRID_SIZE; col++) {
	        if (grid[row][col].getValue() == value) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public boolean isValidInCol(int col, int value) {
	    for (int row = 0; row < GRID_SIZE; row++) {
	        if (grid[row][col].getValue() == value) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public boolean isValidInBox(int startRow, int startCol, int value) {
	    for (int row = 0; row < 3; row++) {
	        for (int col = 0; col < 3; col++) {
	            if (grid[startRow + row][startCol + col].getValue() == value) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	public boolean isValidMove(int row, int col, int value) {
	    return grid[row][col].isEmpty() &&
	           isValidInRow(row, value) &&
	           isValidInCol(col, value) &&
	           isValidInBox(row - row % 3, col - col % 3, value);
	}

	
	public boolean isSolved() {
	    for (int row = 0; row < GRID_SIZE; row++) {
	        for (int col = 0; col < GRID_SIZE; col++) {
	            if (grid[row][col].isEmpty() || !isValidMove(row, col, grid[row][col].getValue())) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	public boolean solveBoard() {
        for (int row = 0; row < GRID_SIZE; row ++){
            for (int col = 0; col < GRID_SIZE; col++){
                if (grid[row][col].getValue() == 0){
                    for (int numToTry = 1; numToTry <= GRID_SIZE; numToTry++){
                        if (isValidMove(row, col, numToTry)){
                        	grid[row][col].setValue(numToTry);
                        	
                            if (solveBoard()){
                                return true;
                            } else {
                            	grid[row][col].setValue(0);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
