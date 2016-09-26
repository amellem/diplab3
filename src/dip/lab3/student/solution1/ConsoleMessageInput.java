
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author aerius
 */
public class ConsoleMessageInput implements MessageInput{
    Scanner keyboardInput = new Scanner(System.in);

    private String inputMessage;
    
    @Override
    public String getInputMessage(){
        return inputMessage;
    }

    @Override
    public String setInputMessage() {
        System.out.println("Plese enter your message");
        inputMessage = keyboardInput.nextLine();
        return inputMessage;
    }
    
    
    
    
    
}
