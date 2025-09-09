package SudokuGUI.src.sudokuGUI;

import java.awt.EventQueue;

public class Play {

    public static void main(String[] args) {
        System.out.println("Launching application...");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Window window = new Window();
                    System.out.println("Window created successfully.");
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
