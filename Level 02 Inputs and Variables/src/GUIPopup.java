import org.w3c.dom.ls.LSOutput;

import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class GUIPopup {
    //constructor
    public GUIPopup() {
        //do some stuff
        String answer = JOptionPane.showInputDialog(null,
                "Question 1:\n\"What's the capital of France?\"\n\n",
                "Quiz",
                JOptionPane.QUESTION_MESSAGE
        );

        if (answer.equals("Paris")) {
            String message = answer + " is correct!";
            JOptionPane.showMessageDialog(null,
                    message, "Correct!",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            String message = answer + " is incorrect!";
            JOptionPane.showMessageDialog(null,
                    message, "Correct!",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        String number = JOptionPane.showInputDialog(null,
                "Question 1:\n\"What's the capital of France?\"\n\n",
                "Quiz",
                JOptionPane.QUESTION_MESSAGE
        );
        int numberInt = Integer.parseInt(number);
        for (int i = 0; i < numberInt; i++) {
            System.out.println(number);
        }
        int a = 5/4;
        System.out.println(a);
        double raise =
        Math.pow(2.718, 9);
    }
}
