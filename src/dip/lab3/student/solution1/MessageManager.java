
package dip.lab3.student.solution1;


/**
 *
 * @author aerius
 */
public class MessageManager {
    
    public final void doInputMessage(MessageInput inputType, MessageOutput outputType){
        
        inputType.setInputMessage();
        inputType.getInputMessage();
      
        outputType.getOutMessage(inputType.getInputMessage());
        
        
    }   
}
