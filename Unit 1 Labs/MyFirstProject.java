import javax.swing.*;
import java.awt.FlowLayout;

public class MyFirstProject
{
    public static void makeMyWindow()
    {
        JFrame ProjectFrame;
        JButton FrameButton;
        JTextField FrameText;
        JLabel FrameLabel;
        FlowLayout FrameManager;
        ActionConnector FrameConnector;
        
        ProjectFrame = new JFrame ("Test Name");
        FrameButton = new JButton ("Test Button");
        FrameText = new JTextField(50);
        FrameLabel = new JLabel ("TestLabel");
        FrameManager = new FlowLayout();
        FrameConnector = new ActionConnector();
        
        ProjectFrame.add(FrameButton);
        ProjectFrame.add(FrameText);
        ProjectFrame.add(FrameLabel);
        ProjectFrame.setLayout(FrameManager);
        ProjectFrame.setSize(300,300);
        ProjectFrame.setVisible(true);
        
        FrameConnector.addTextField(FrameText);
        FrameConnector.addButton(FrameButton);
        FrameConnector.addLabel(FrameLabel);
        
        FrameButton.addActionListener(FrameConnector);
        
    }
}