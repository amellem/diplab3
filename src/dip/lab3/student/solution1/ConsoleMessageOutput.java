
package dip.lab3.student.solution1;


/**
 *
 * @author amellem
 */
public class ConsoleMessageOutput implements MessageOutput{

    
    @Override
    public void getOutMessage(String outputMessage) {
        System.out.println(outputMessage);
    }   
    
    
}
