package videotheek;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.lang.String.valueOf;

public class Gui implements ActionListener {

    JFrame frame;
    JPanel contentPane;
    ArrayList<JButton> klantknoppen;
    ArrayList<JPanel> media_klant = new ArrayList<>();


    public Gui() {
        this.frame = init();
    }

    private JFrame init() {
        frame = new JFrame();
        contentPane = new JPanel();
        frame.setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());
        JPanel klanten = new JPanel();
        //klanten.setBackground(Color.lightGray);
        JPanel media = new JPanel();
        CardLayout cl = new CardLayout();
        media.setLayout(cl);
        contentPane.add(klanten, BorderLayout.NORTH);
        contentPane.add(media, BorderLayout.CENTER);

        ArrayList<Klant> klantenArray = VideotheekSingleton.getInstance().getKlanten();
        klanten.setLayout(new GridLayout(klantenArray.size()/2, 2, 10, 10));
        klanten.setBorder(new EmptyBorder(10, 200, 10, 200));
        int i = 0;
        klantknoppen= new ArrayList<>();
        media.add(new JPanel(), "empty");
        cl.show(media, "empty");
        for (int j = 0; j < klantenArray.size(); j++) {

        }
        for (Klant k: klantenArray) {
            ArrayList titels = k.sorteerOpTitel();
            JPanel x = new JPanel();
            for (Object j: titels
                 ) {
                x.add(new JLabel(j.toString()));
            }

            media.add(x, k.getNaam());

            klantknoppen.add(new JButton(k.getNaam()));
            klantknoppen.get(i).addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cl.show(media, k.getNaam());
                }
            });
            klanten.add(klantknoppen.get(i));

            i++;
        }


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setVisible(true);
        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
