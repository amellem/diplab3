
package dip.lab3.student.solution1;

/**
 *
 * @author aerius
 */
public class ConsoleMessageOutput implements MessageOutput{

    // Output the user input
    @Override
    public final void getOutMessage(String outputMessage) {
        System.out.println(outputMessage);
    }   
    
    
}
