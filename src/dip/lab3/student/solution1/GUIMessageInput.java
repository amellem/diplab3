
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;
/**
 *
 * @author aerius
 */
public class GUIMessageInput implements MessageInput{

    // String value to use for input and output
    private String inputMessage;
    
    // return the user input
    @Override
    public final String getInputMessage(){
        return inputMessage;
    }

    // get the user input
    @Override
    public final void setInputMessage() {
        inputMessage = JOptionPane.showInputDialog(null, "Please enter your message");
    }

 
    
    
}
