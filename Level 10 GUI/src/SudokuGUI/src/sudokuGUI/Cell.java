package SudokuGUI.src.sudokuGUI;

public class Cell {
	
	private int value;
	private int row;
	private int column;
	private boolean editable; //

	public Cell(int row, int column) {
		this.value = 0;
		this.row = row;
		this.column = column;
		this.editable = true;		
	}
	
	//Getters
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		if (editable) {
			this.value = value;
		}
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return column;
	}
	

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
	//check if empty
	public boolean isEmpty() {
		return value == 0;
	}

}
