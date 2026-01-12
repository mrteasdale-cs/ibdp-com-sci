import javax.swing.*;
import java.awt.*;

public class MyFirstWindow {

//Default constructor - constructor that uses
// default values when no other constructor available
public MyFirstWindow() {
    JFrame frame = new JFrame("My First GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setLayout(new GridLayout(2, 2));

    JPanel panel = new JPanel();
    panel.setBackground(Color.YELLOW);
    panel.setLayout(new BorderLayout());

    JPanel panel2 = new JPanel();
    panel2.setBackground(Color.BLUE);
    panel2.setLayout(new BorderLayout());

    JLabel label = new JLabel("Hello World");
    label.setForeground(Color.BLUE);
    label.setFont(new Font("San Serif", Font.BOLD, 30));

    frame.add(panel);
    frame.add(panel2);
    panel.add(label);
}

}
