
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;
/**
 *
 * @author aerius
 */
public class GUIMessageOutput implements MessageOutput{

    // Output the user input
    @Override
    public final void getOutMessage(String outputMessage) {
        JOptionPane.showMessageDialog(null,outputMessage);
    }
    
}
