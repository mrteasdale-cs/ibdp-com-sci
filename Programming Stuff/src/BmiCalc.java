import javax.swing.*;
import java.awt.*;

public class BmiCalc {
    private JFrame mainFrame;
    private BMIPanel bmiPanel;

    public BmiCalc() {
        initComponents();
    }

    private void initComponents() {
        mainFrame = new JFrame("BMI Calculator");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);

        bmiPanel = new BMIPanel();

        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(bmiPanel, BorderLayout.NORTH);
    }

    public void show() {
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BmiCalc().show();
        });
    }
}