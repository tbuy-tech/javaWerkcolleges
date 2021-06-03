package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display implements ActionListener {
    JFrame frame;
    JButton som;
    JButton verschil;
    JButton maal;
    JButton deel;
    JTextField resultaatInvoer;
    JTextField getal1Invoer;
    JTextField getal2Invoer;
    JDialog d;

    public JDialog getD() {
        return d;
    }

    JButton button;

    public Display() {
        frame = init();
    }

    private JFrame init() {
        JFrame frame = new JFrame("Calculator");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content.setLayout(new BorderLayout());
        JPanel panelTop = new JPanel();
        JLabel label = new JLabel("Bewerking");
        JLabel afsluiten = new JLabel("afsluiten");
        panelTop.add(label);
        panelTop.add(afsluiten);
        JPanel panelmiddle = new JPanel();
        JLabel getal1 = new JLabel("Getal 1: ");
        getal1Invoer = new JTextField(5);
        JLabel getal2 = new JLabel("Getal 2: ");
        getal2Invoer = new JTextField(5);
        JLabel resultaat = new JLabel("resultaat: ");
        resultaatInvoer = new JTextField(5);
        panelmiddle.add(getal1);
        panelmiddle.add(getal1Invoer);
        panelmiddle.add(getal2);
        panelmiddle.add(getal2Invoer);
        panelmiddle.add(resultaat);
        panelmiddle.add(resultaatInvoer);
        JPanel panelbottom = new JPanel();
        som = new JButton("Som");
        verschil = new JButton("Verschil");
        maal = new JButton("Maal");
        deel = new JButton("Deel");
        panelbottom.add(som);
        panelbottom.add(verschil);
        panelbottom.add(maal);
        panelbottom.add(deel);
        content.add(panelTop, BorderLayout.NORTH);
        content.add(panelmiddle, BorderLayout.CENTER);
        content.add(panelbottom, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
        return frame;
    }

    public JButton getSom() {
        return som;
    }

    public JButton getVerschil() {
        return verschil;
    }

    public JButton getMaal() {
        return maal;
    }

    public JButton getDeel() {
        return deel;
    }

    public JTextField getResultaatInvoer() {
        return resultaatInvoer;
    }

    public JTextField getGetal1Invoer() {
        return getal1Invoer;
    }

    public JTextField getGetal2Invoer() {
        return getal2Invoer;
    }

    public JButton getButton() {
        return button;
    }

    public void showPopUp () {
        d = new JDialog(frame, "Missing value");
        d.setLayout(new BorderLayout());
        // create a label
        JLabel l = new JLabel("Fill in all the boxes please.");
        button = new JButton("OK");
        button.addActionListener(this);
        d.add(l, BorderLayout.CENTER);
        d.add(button, BorderLayout.SOUTH);
        // setsize of dialog
        d.setSize(200, 100);

        // set visibility of dialog
        d.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("ok");
            d.dispose();
        }
    }
}
