package SudokuGUI.src.sudokuGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JTextArea;

public class Window {

	public JFrame frame;
	private JTextField[][] cellFields;
	private Cell[][] cells;
	private Sudoku game;
	

	/**
	 * Create the application.
	 */
	public Window() {
		Sudoku game = new Sudoku();
		cellFields = new JTextField[9][9];
        cells = new Cell[9][9];
		initialize();
		
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 475, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel gameboardPanel = new JPanel();
		gameboardPanel.setBounds(10, 406, 439, 53);
		frame.getContentPane().add(gameboardPanel);
		
		JButton btnSolveBoard = new JButton("Solve!");
		btnSolveBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		gameboardPanel.add(btnSolveBoard);
		
		JButton bthGenerateNewBoard = new JButton("Generate Board");
		bthGenerateNewBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game = new Sudoku();
				populateGrid();
			}
		});
		gameboardPanel.add(bthGenerateNewBoard);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBounds(10, 11, 439, 396);
		frame.getContentPane().add(buttonsPanel);
		buttonsPanel.setLayout(new GridLayout(0, 9, 0, 0));
		
		
		for (int i = 0; i < 9; i++) {
	        for (int j = 0; j < 9; j++) {
	            JTextField cellField = new JTextField();
	            cellFields[i][j] = cellField;
	            cells[i][j] = new Cell(i, j);
	            buttonsPanel.add(cellField);

	            final int row = i;
	            final int col = j;
	            //cellField.addActionListener(e -> updateCellValue(row, col));
	        }
	    }

	    populateGrid();

	}
	
	private void populateGrid() {
	    int[][] puzzle = game.generatePuzzle();
	    for (int i = 0; i < 9; i++) {
	        for (int j = 0; j < 9; j++) {
	            int value = puzzle[i][j];
	            cells[i][j].setValue(value);
	            if (value != 0) {
	                cellFields[i][j].setText(String.valueOf(value));
	                cellFields[i][j].setEditable(false);
	                cells[i][j].setEditable(false);
	            } else {
	                cellFields[i][j].setText("");
	            }
	        }
	    }
	}

}
