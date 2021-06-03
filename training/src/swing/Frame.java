package swing;
import javax.swing.*;
import java.awt.*;

public class Frame {
    public Frame() {
        init();
    }

    public void init(){
        JFrame frame = new JFrame("Inloggen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.blue);
        frame.setSize(420,420);

        JPanel contentPane = new JPanel();
        //contentPane.setLayout();
        frame.setContentPane(contentPane);

        JPanel gebruiker = new JPanel();
        JPanel wachtwoord = new JPanel();
        JLabel gebr = new JLabel("Gebruiker: ");
        JTextField gebrText = new JTextField(20);
        JTextField passrText = new JTextField(20);
        JLabel passw = new JLabel("Wachtwoord: ");
        gebruiker.add(gebr);
        gebruiker.add(gebrText);
        wachtwoord.add(passw);
        wachtwoord.add(passrText);
        JPanel buttons = new JPanel();
        buttons.add(new JButton("cancel"));
        buttons.add(new JButton("Confirm"));
        contentPane.add(gebruiker);


        contentPane.add(wachtwoord);
        contentPane.add(buttons);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame();
    }


}
