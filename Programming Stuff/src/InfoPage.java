import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPage extends JFrame{
    private JTextField nameTxtField;
    private JTextField heightTxtField;
    private JTextField ageTxtField;
    private JTextField weightTxtField;
    private JButton Submit;
    private JFrame frame;
    private JPanel contentPanel;
    private JPanel titlePanel;

    public InfoPage() {
        setTitle("Info Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setSize(300, 300);
        setVisible(true);

        frame.add(titlePanel);
        frame.add(contentPanel);

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double getBMR;
                int age = Integer.parseInt(ageTxtField.getText());
                double height = Integer.parseInt(heightTxtField.getText());
                double weight = Integer.parseInt(weightTxtField.getText());
                getBMR = 88.36 + (13.4*weight) + (4.8*height) - (5.7*age);
                String output = "Hello" + nameTxtField.getText() + ", Height = " + height + ", Weight = " + weight + ", BMR =" + getBMR + "\n";
                JOptionPane.showMessageDialog(null,output);
            }
        });
    }


}