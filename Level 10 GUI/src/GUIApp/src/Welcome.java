package GUIApp.src;

import javax.swing.*;
import java.awt.*;
public class Welcome extends JFrame{

        //constructor
        public Welcome() {
            generateGUI();
        }

        public void generateGUI() {
            setTitle("Welcome");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel outerPanel = new JPanel();
            outerPanel.setLayout(new BorderLayout());
            JPanel innerPanel = new JPanel();
            innerPanel.setLayout(new GridLayout(2, 1));

            JButton butt1 = new JButton("Enter");

            JLabel welcomeLabel = new JLabel("Welcome! You have successfully logged in.");
            welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

            outerPanel.add(welcomeLabel, BorderLayout.NORTH);
            innerPanel.add(butt1, BorderLayout.CENTER);

            add(outerPanel);
            add(innerPanel);
        }

    }
