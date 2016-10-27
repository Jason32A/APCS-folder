import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.Component;
import javax.swing.*;

public class ActionConnector implements ActionListener
{
    private ArrayList<Component> actionSenders;
    private ArrayList<Component> actionReceivers;
    private JButton myButton;
    private JLabel myLabel;
    private JTextField myTextField;
    
    public ActionConnector()
    {
        actionSenders = new ArrayList<Component>();
        actionReceivers = new ArrayList<Component>();
    }
    
    public void addButton(JButton button)
    {
        myButton = button;
    }
    public void addTextField(JTextField field) {
        myTextField = field;
    }
    public void addLabel(JLabel label) {
        myLabel = label;
    }
    
    public void actionPerformed (ActionEvent e) {
        try {
            myLabel.setText(myTextField.getText());
            myTextField.setText("");
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}