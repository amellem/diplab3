
package dip.lab3.student.solution1;

/**
 *
 * @author aerius
 */
public class MessageManager {
    
    public final void doInputMessage(MessageInput input, MessageOutput output){
        // get the input type
        input.setInputMessage();
        // get the output type
        input.getInputMessage();
      
        // output the input message
        output.getOutMessage(input.getInputMessage());
        
        
    }   
}
