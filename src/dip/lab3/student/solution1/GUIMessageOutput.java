
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;
/**
 *
 * @author amellem
 */
public class GUIMessageOutput implements MessageOutput{

    @Override
    public void getOutMessage(String outputMessage) {
        JOptionPane.showMessageDialog(null,outputMessage);
    }
    
}
