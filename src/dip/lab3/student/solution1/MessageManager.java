
package dip.lab3.student.solution1;


/**
 *
 * @author amellem
 */
public class MessageManager {
    
    public final void doInputMessage(MessageInput inputType, MessageOutput outputType){
        
        inputType.setInputMessage();
        inputType.getInputMessage();
      
        outputType.getOutMessage(inputType.getInputMessage());
        
        
    }   
}
