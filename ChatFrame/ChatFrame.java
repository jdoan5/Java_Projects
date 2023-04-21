package ChatFrame;
import javax.swing.*;
import java.awt.*;

public class ChatFrame {
    
    public static void main(String [] args) {
        
        // Create a frame
        JFrame frame  = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
       

        // Create a MenuBar, adding Components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save As");
        m1.add(m11);
        m1.add(m22);

        // Creating the panel at bottom and adding components
        JPanel panel = new JPanel();
        JLabel label = new JLabel ("Enter text ");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the center
        JTextArea ta = new JTextArea();

        // Adding Components to the frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setVisible(true);

    }
}
