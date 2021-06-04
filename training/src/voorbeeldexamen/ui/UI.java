package voorbeeldexamen.ui;

import voorbeeldexamen.model.database.BordSpelDAO;
import voorbeeldexamen.model.database.DatabaseSingleton;
import voorbeeldexamen.model.entity.Bordspel;
import voorbeeldexamen.model.entity.Tafel;
import voorbeeldexamen.model.entity.VervallenException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class UI {
    JFrame frame;
    JPanel contentPane;
    ArrayList<Tafel> tafels;
    ArrayList<Bordspel> bordspelen;
    JComboBox tafelComboBox;
    JComboBox bordspelComboBox;
    JButton toevoegen;
    JTextArea textBlock;

    public UI() {
        this.frame = init();
    }

    private JFrame init() {
        frame = new JFrame("Earthen Board");
        contentPane = new JPanel();
        frame.setContentPane(contentPane);
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(top, BorderLayout.NORTH);
        JLabel tafelLabel = new JLabel("Tafels: ");
        tafelComboBox = new JComboBox();
        addTafels(tafelComboBox);
        BordSpelDAO bordSpelDAO = new BordSpelDAO();
        bordspelen = bordSpelDAO.geefAlleBordspellen();

        JLabel bordspelenLabel = new JLabel("Bordspel: ");
        bordspelComboBox = new JComboBox();

        addBordSpelen(bordspelComboBox);
        top.add(tafelLabel);
        top.add(tafelComboBox);
        top.add(bordspelenLabel);
        top.add(bordspelComboBox);
        bottom.setBackground(Color.GREEN);
        contentPane.add(bottom, BorderLayout.CENTER);
        textBlock = new JTextArea(33,59);
        bottom.add(textBlock);
        toevoegen = new JButton("Toevoegen");
        toevoegen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                BordSpelDAO bordSpelDAO = new BordSpelDAO();
                System.out.println("pushed");
                String tafelValue = String.valueOf(tafelComboBox.getSelectedItem());
                String bordspelValue = String.valueOf(bordspelComboBox.getSelectedItem());
                for (Tafel tafel: tafels) {
                    if (tafel.getNaam().equals(tafelValue)) {
                        for (Bordspel bordspel: bordspelen) {
                            System.out.println(bordspel.getNaam() + " - " + bordspelValue);
                            System.out.println(bordspel.getNaam() == bordspelValue);
                            if (bordspel.getNaam().equals(bordspelValue)) {
                                try {
                                    tafel.voegProductToe(bordspel);
                                } catch (VervallenException vervallenException) {
                                    vervallenException.printStackTrace();
                                }
                                System.out.println(tafel.bestellingToString());
                                textBlock.setText(tafel.bestellingToString());
                            }
                        }

                    }
                }


            }
        });
        top.add(toevoegen);
        //textBlock.setSize(new Dimension(600, 500));

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

    private void addBordSpelen(JComboBox bordspelComboBox) {
        BordSpelDAO bordSpelDAO = new BordSpelDAO();

        for (Bordspel bordspel: bordSpelDAO.geefAlleBordspellen()) {
            bordspelComboBox.addItem(bordspel.getNaam());
        }
    }

    private void addTafels(JComboBox tafelComboBox) {
        tafels = new ArrayList<Tafel>();
        tafels.add(new Tafel("Tafel 1"));
        tafels.add(new Tafel("Tafel 2"));
        tafels.add(new Tafel("Tafel 3"));
        tafels.add(new Tafel("Tafel 4"));
        for (Tafel tafel: tafels
             ) {
            tafelComboBox.addItem(tafel.getNaam());
        }
    }
}
