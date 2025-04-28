import javax.swing.*;
import java.awt.*;

public class SimpleGUI extends JFrame {

    public SimpleGUI() {
        setTitle("Four Color Panels");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(2, 2));

        JPanel redPanel = createColorPanel(Color.RED, "Red Panel");
        JPanel bluePanel = createColorPanel(Color.BLUE, "Blue Panel");
        JPanel greenPanel = createColorPanel(Color.GREEN, "Green Panel");
        JPanel yellowPanel = createColorPanel(Color.YELLOW, "Yellow Panel");

        add(redPanel);
        add(bluePanel);
        add(greenPanel);
        add(yellowPanel);
    }

    private JPanel createColorPanel(Color color, String labelText) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel(labelText);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(color == Color.YELLOW ? Color.BLACK : Color.WHITE);

        panel.add(label, BorderLayout.CENTER);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleGUI().setVisible(true);
        });
    }
}
