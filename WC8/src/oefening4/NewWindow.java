package oefening4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JPanel smallpanel1, smallpanel2, smallpanel3;
    private  JLabel message;
    private JButton button;

    public NewWindow() {
        getFrame();
    }

    public JFrame getFrame() {
        if (frame == null) {
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Resultaat");
            frame.setSize(300, 300);
            frame.setContentPane(getContentPane());
            frame.setVisible(true);
        }
        return frame;
    }


    public JPanel getContentPane() {
        if (panel == null) {
            panel = new JPanel();
            panel.setLayout(new GridLayout(3, 1));
            panel.add(getSmallpanel1());
            panel.add(getSmallpanel2());


        }
        return panel;
    }

    public JPanel getSmallpanel1() {
        if (smallpanel1 == null) {
            smallpanel1 = new JPanel();
            smallpanel1.add(getMessage());
        }
        return smallpanel1;
    }

    public JPanel getSmallpanel2() {
        if (smallpanel2 == null) {
            smallpanel2 = new JPanel();
            smallpanel2.add(getButton());

        }
        return smallpanel2;
    }

    public JLabel getMessage() {
        if (message == null) {
            message = new JLabel("Je bent ingelogd.");
        }
        return message;
    }

    public JButton getButton() {
        if (button == null) {
            button = new JButton("OK");
            button.addActionListener(this);
        }
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();

        }
    }
}

