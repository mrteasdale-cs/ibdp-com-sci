import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BMIPanel extends JPanel {
    private JTextField weightField;
    private JTextField heightField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public BMIPanel() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel titleLabel = new JLabel("BMI Calculator");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);

        JLabel weightLabel = new JLabel("Weight (kg):");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(weightLabel, gbc);

        weightField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(weightField, gbc);

        JLabel heightLabel = new JLabel("Height (cm):");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(heightLabel, gbc);

        heightField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(heightField, gbc);

        calculateButton = new JButton("Calculate BMI");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(calculateButton, gbc);

        resultLabel = new JLabel("BMI: ");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(resultLabel, gbc);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        try {
            float weight = Float.parseFloat(weightField.getText());
            float height = Float.parseFloat(heightField.getText()) / 100; // convert cm to m
            float bmi = weight / (height * height);
            resultLabel.setText(String.format("BMI: %.2f", bmi));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter numbers.");
        }
    }
}
