package oefening2;

import javax.swing.*;
import java.awt.*;

public class Swing {
    public void createDisplay(){
        JFrame frame = new JFrame();
        frame.setSize(340,320);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing ex2");
        frame.setBackground(Color.BLACK);
        Container c = frame.getContentPane();
        JLabel label1 = new JLabel("Hello, I am label one.");
        label1.setBackground(Color.RED);
        label1.setOpaque(true);
        JLabel label2 = new JLabel("Hello, I am label two.");
        label2.setBackground(Color.GREEN);
        label2.setOpaque(true);
        c.setLayout(null);
        c.add(label1);
        c.add(label2);
        label1.setBounds(100,100, 120, 50);
        label2.setBounds(100,150, 120, 50);
        c.setBackground(Color.black);

    }

    public static void main(String[] args) {
        Swing swing = new Swing();
        swing.createDisplay();
    }

}
