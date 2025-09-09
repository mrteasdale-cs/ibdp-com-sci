import javax.swing.JOptionPane;
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
            JOptionPane.showMessageDialog(null,
                    "Correct, it is Paris!", "Correct!",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
