
package dip.lab3.student.solution1;

/**
 *
 * @author amellem
 */
public class StartUp {
    public static void main(String[] args) {
           MessageInput inputMessage = new GUIMessageInput();
           MessageOutput outputMessage = new GUIMessageOutput();
           MessageManager messageManager = new MessageManager();
           
           messageManager.doInputMessage(inputMessage, outputMessage);
      
        
    }
}
