package sudokuGUI;

import java.util.Scanner;

public class Sudoku {

	private Board board;
	
	public Sudoku() {
		board = new Board();
	}
	
	//load board
	public int[][] generatePuzzle() {
		
	    int[][] puzzle = {
	            {5, 3, 0, 0, 7, 0, 0, 0, 0},
	            {6, 0, 0, 1, 9, 5, 0, 0, 0},
	            {0, 9, 8, 0, 0, 0, 0, 6, 0},
	            {8, 0, 0, 0, 6, 0, 0, 0, 3},
	            {4, 0, 0, 8, 0, 3, 0, 0, 1},
	            {7, 0, 0, 0, 2, 0, 0, 0, 6},
	            {0, 6, 0, 0, 0, 0, 2, 8, 0},
	            {0, 0, 0, 4, 1, 9, 0, 0, 5},
	            {0, 0, 0, 0, 8, 0, 0, 7, 9}
	        };

	        for (int row = 0; row < 9; row++) {
	            for (int col = 0; col < 9; col++) {
	                board.setCellValue(row, col, puzzle[row][col]);
	                if (puzzle[row][col] != 0) {
	                    board.getCell(row, col).setEditable(false);
	                }
	            }
	        }
		return puzzle;
	}
	
	public boolean makeMove(int row, int col, int value) {
		if (board.isValidMove(row, col, value)) {
			board.setCellValue(row, col, value);
			return true;
		}
		return false;
	}
	
	public boolean isSolved() {
		return board.isSolved();
	}
	
	public void printBoard() {
	    for (int row = 0; row < 9; row++) {
	        if (row % 3 == 0 && row != 0) {
	            System.out.println("---------------------");
	        }
	        for (int col = 0; col < 9; col++) {
	            if (col % 3 == 0 && col != 0) {
	                System.out.print("| ");
	            }
	            int value = board.getCellValue(row, col);
	            System.out.print((value == 0 ? " " : value) + " ");
	        }
	        System.out.println();
	    }
	}
	
	public void play() {
	    generatePuzzle();
	    Scanner scanner = new Scanner(System.in);

	    while (!isSolved()) {
	        printBoard();
	        System.out.println("Want to solve this instantly?");
	        if (scanner.next().equals("y")) {
	        	if(board.solveBoard()) {
		        	printBoard();
		        	break;
	        	} else {
	        		System.out.println("Not solvable");
	        	}
	        } else {
		        System.out.println("Enter row, column, and value (e.g., 1 2 3):");
		        int row = scanner.nextInt() - 1;
		        int col = scanner.nextInt() - 1;
		        int value = scanner.nextInt();
	
		        if (makeMove(row, col, value)) {
		            System.out.println("Move successful!");
		        } else {
		            System.out.println("Invalid move. Try again.");
		        }
	        }
	    }
	    System.out.println("Congratulations! You solved the puzzle!");
	    scanner.close();
	}

}
