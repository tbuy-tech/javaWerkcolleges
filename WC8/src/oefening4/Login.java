package oefening4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JPanel smallpanel1, smallpanel2, smallpanel3;
    private JTextField username;
    private JPasswordField password;
    private  JLabel userText, passwordText;
    private JButton button;

    public Login() {
        getFrame();
    }

    public JFrame getFrame() {
        if (frame == null) {
            frame = new JFrame();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Inloggen");
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
            panel.add(getSmallpanel3());

        }
        return panel;
    }

    public JPanel getSmallpanel1() {
        if (smallpanel1 == null) {
            smallpanel1 = new JPanel();
            smallpanel1.add(getUserText());
            smallpanel1.add(getUsername());
        }
        return smallpanel1;
    }

    public JPanel getSmallpanel2() {
        if (smallpanel2 == null) {
            smallpanel2 = new JPanel();
            smallpanel2.add(getPasswordText());
            smallpanel2.add(getPassword());
        }
        return smallpanel2;
    }

    public JPanel getSmallpanel3() {
        if (smallpanel3 == null) {
            smallpanel3 = new JPanel();
            smallpanel3.add(getButton());
        }
        return smallpanel3;
    }

    public JTextField getUsername() {
        if (username == null) {
            username = new JTextField(12);
        }
        return username;
    }

    public JPasswordField getPassword() {
        if (password == null) {
            password = new JPasswordField(12);
        }
        return password;
    }

    public JLabel getUserText() {
        if (userText == null) {
            userText = new JLabel("Username: ");
        }
        return userText;
    }

    public JLabel getPasswordText() {
        if (passwordText == null) {
            passwordText = new JLabel("Password: ");
        }
        return passwordText;
    }

    public JButton getButton() {
        if (button == null) {
            button = new JButton("Log in");
            button.addActionListener(this);
        }
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
            new NewWindow();
        }
    }


}
