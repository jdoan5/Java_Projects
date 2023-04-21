package Typer;
import javax.swing.*;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class typer extends JFrame {

    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

       JButton button1 = new JButton("Button 1");
       JButton button2 = new JButton("Button 2");

       frame.getContentPane().add(button1);
       frame.getContentPane().add(button2);
       frame.setVisible(true);
     }
}