
package dip.lab3.student.solution1;

/**
 *
 * @author aerius
 */
public class StartUp {
    public static void main(String[] args) {
        
            // get user input
           MessageInput inputMessage = new GUIMessageInput();
           //output user input
           MessageOutput outputMessage = new GUIMessageOutput();
           
           // manage user input & output
           MessageManager messageManager = new MessageManager();
           // perform manager method
           messageManager.doInputMessage(inputMessage, outputMessage);
      
         
    }
}
