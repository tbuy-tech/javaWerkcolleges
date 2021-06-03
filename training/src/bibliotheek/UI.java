package bibliotheek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI implements ActionListener {

    JFrame frame;
    JPanel contentpane;
    JPanel loginPanel;
    JPanel mainPanel;
    CardLayout cl;
    JButton closeButton;


    JTextField naamInvoer;
    JTextField wachtwoordInvoer;
    JDialog d;
    JButton loginKnop;

    JTextField boekInvoer;
    JButton knopBoek;

    JTextField lidNaamInvoer;
    JTextField lidWachtwoordInvoer;
    JButton knopLid;

    LidDAO lidDAO = new LidDAO();

    public UI() {
        frame = init();
    }


    private JFrame init() {
        frame = new JFrame();
        contentpane = new JPanel();
        frame.setContentPane(contentpane);
        cl = new CardLayout();
        contentpane.setLayout(cl);
        loginPanel = createLoginPanel();
        mainPanel = createMainPanel();
        contentpane.add(loginPanel, "loginPanel");
        contentpane.add(mainPanel, "mainPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel();
        JPanel panneelke = new JPanel();
        panneelke.setLayout(new BorderLayout());
        mainPanel.add(panneelke);
        JPanel titel = new JPanel();
        titel.add(new JLabel("Hoofdmenu"));
        JPanel leden = new JPanel();
        JPanel boeken = new JPanel();
        panneelke.add(titel, BorderLayout.NORTH);
        panneelke.add(leden, BorderLayout.EAST);
        panneelke.add(boeken, BorderLayout.WEST);

        boeken.setLayout(new BorderLayout());
        JPanel boekInvoerTitel = new JPanel();
        boekInvoerTitel.add(new JLabel("Voeg boek toe: "));
        boeken.add(boekInvoerTitel, BorderLayout.NORTH);
        JPanel boekInvoerPanel = new JPanel();
        JLabel boekLabel = new JLabel("titel: ");
        boekInvoer = new JTextField(15);
        boekInvoerPanel.add(boekLabel);
        boekInvoerPanel.add(boekInvoer);
        boeken.add(boekInvoerPanel, BorderLayout.CENTER);

        JPanel knoppenBoekPanel = new JPanel();
        knopBoek = new JButton("Voeg boek toe");
        knopBoek.addActionListener(this);
        knoppenBoekPanel.add(knopBoek);
        boeken.add(knoppenBoekPanel, BorderLayout.SOUTH);

        leden.setLayout(new BorderLayout());
        JPanel ledenInvoerTitel = new JPanel();
        ledenInvoerTitel.add(new JLabel("Voeg lid toe: "));
        leden.add(ledenInvoerTitel, BorderLayout.NORTH);
        JPanel lidInvoerPanel = new JPanel();
        lidInvoerPanel.setLayout(new BorderLayout());
        JPanel lidInvoerSubPanel = new JPanel();
        JPanel lidInvoerSubPanel2 = new JPanel();
        lidInvoerPanel.add(lidInvoerSubPanel, BorderLayout.NORTH);
        lidInvoerPanel.add(lidInvoerSubPanel2, BorderLayout.SOUTH);

        JLabel lidNaam = new JLabel("Naam: ");
        lidNaamInvoer = new JTextField(15);
        lidInvoerSubPanel.add(lidNaam);
        lidInvoerSubPanel.add(lidNaamInvoer);

        JLabel lidWachtwoord = new JLabel("Wachtwoord: ");
        lidWachtwoordInvoer = new JTextField(15);
        lidInvoerSubPanel2.add(lidWachtwoord);
        lidInvoerSubPanel2.add(lidWachtwoordInvoer);

        leden.add(lidInvoerPanel, BorderLayout.CENTER);

        JPanel knoppenLidPanel = new JPanel();
        knopLid = new JButton("Voeg lid toe");
        knopLid.addActionListener(this);
        knoppenLidPanel.add(knopLid);
        leden.add(knoppenLidPanel, BorderLayout.SOUTH);

        return mainPanel;
    }


    private JPanel createLoginPanel() {
        JPanel loginPanel = new JPanel();
        JPanel panneelke = new JPanel();
        panneelke.setLayout(new BorderLayout());
        loginPanel.add(panneelke);
        JPanel naam = new JPanel();
        JLabel naamLabel = new JLabel("Naam: ");
        naamInvoer = new JTextField(15);
        naam.add(naamLabel);
        naam.add(naamInvoer);
        JPanel wachtwoord = new JPanel();
        JLabel wachtwoordLabel = new JLabel("Wachtwoord: ");
        wachtwoordInvoer = new JTextField(15);
        wachtwoord.add(wachtwoordLabel);
        wachtwoord.add(wachtwoordInvoer);
        panneelke.add(naam, BorderLayout.NORTH);
        panneelke.add(wachtwoord, BorderLayout.CENTER);
        JPanel knoppen = new JPanel();
        loginKnop = new JButton("Log in");
        loginKnop.addActionListener(this);
        knoppen.add(loginKnop);
        panneelke.add(knoppen, BorderLayout.SOUTH);


        return loginPanel;
    }

    public void showPopUp(String titel, String message) {
        d = new JDialog(frame, titel);
        d.setLayout(new BorderLayout());
        // create a label
        JLabel l = new JLabel(message);
        closeButton = new JButton("OK");
        closeButton.addActionListener(this);
        d.add(l, BorderLayout.CENTER);
        d.add(closeButton, BorderLayout.SOUTH);
        // setsize of dialog
        d.setSize(200, 100);

        // set visibility of dialog
        d.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginKnop) {
            System.out.println("loginKnop actief");
            if (lidDAO.checkLogIn(naamInvoer.getText(), wachtwoordInvoer.getText())) {
                cl.show(contentpane, "mainPanel");
            } else {
                System.out.println("yo");
                showPopUp("Invoer fout", "Incorrecte login-gegevens");
            }
        }

        if (e.getSource() == closeButton) {
            System.out.println("Closebutton actief");

            d.dispose();
        }

        if (e.getSource() == knopLid) {
            System.out.println("lidknop actief");

            if (!lidDAO.checkLeden(lidNaamInvoer.getText(), lidWachtwoordInvoer.getText())) {
                if (lidDAO.voegLidToe(lidNaamInvoer.getText(), lidWachtwoordInvoer.getText())) {
                    showPopUp("Invoer lid succesvol", lidNaamInvoer.getText() + " is toegevoegd aan het ledenbestand.");
                } else {
                    showPopUp("Invoer lid onsuccesvol", lidNaamInvoer.getText() + " is niet toegevoegd aan het ledenbestand.");
                }
            } else {
                showPopUp("Invoer duplicaat", lidNaamInvoer.getText() + " bestaat al in het ledenbestand.");
            }
        }
    }
}









