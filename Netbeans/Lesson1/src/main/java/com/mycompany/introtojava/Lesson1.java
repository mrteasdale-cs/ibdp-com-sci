// This code is put in by the IDE for you
package com.mycompany.introtojava;
import javax.swing.JOptionPane;
/**
 * IntroductionToJava.java - the basics of Java programming
 * @author X
 * @since 1/1/2025
 * @instructor Mr. Teasdale
 */
public class Lesson1 {

    public static void main(String[] args) {

        ////////////////////////////////////////////////////
        // JAVA BASICS:
        ////////////////////////////////////////////////////

        // This is a comment, anything after the // is a comment

        /*
         * This is another comment (a multi-line comment) because it keeps
         * commenting until another star and slash comes up
         */

        // Simple screen outputs:
        System.out.println("Hello World"); // comment at the end
        
        System.out.print("Hello to the ");
        System.out.println("World");
        System.out.print("From Mr. Tea");
        
        JOptionPane.showMessageDialog(null,
                "Hello, from Mr Tea!", 
                "This is the title",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showInputDialog("Enter Something: ");
        

    }
}
