
package dip.lab3.student.solution1;

import java.util.Scanner;
/**
 *
 * @author aerius
 */
public class ConsoleMessageInput implements MessageInput{
    // Scanner object to assign input
    Scanner keyboardInput = new Scanner(System.in);
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
        System.out.println("Plese enter your message");
        this.inputMessage = keyboardInput.nextLine();   
    }
    
    
    
    
    
}
