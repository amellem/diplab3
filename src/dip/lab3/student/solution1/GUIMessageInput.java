
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;
/**
 *
 * @author amellem
 */
public class GUIMessageInput implements MessageInput{

    private String inputMessage;
    
    @Override
    public String getInputMessage(){
        return inputMessage;
    }

    @Override
    public String setInputMessage() {
        inputMessage = JOptionPane.showInputDialog(null, "Please enter your message");
        return inputMessage;
    }

 
    
    
}
