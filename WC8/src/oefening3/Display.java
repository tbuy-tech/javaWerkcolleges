package oefening3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;


public class Display {

    private JFrame frame;

    private JButton button;

    private JTextField textField;

    private JLabel label, label2;

    private ButtonGroup buttonGroup;

    private JCheckBox checkBox;

    private JComboBox<Integer> comboBox;

    private JPanel panel;

    private JPanel contentPane;

    private JPanel smallPanel1, smallPanel2, smallPanel3, smallPanel4,
            verySmallPanel;

    private JRadioButton radioButton1 = new JRadioButton("optie1", true);

    private JRadioButton radioButton2 = new JRadioButton("optie2");

    private JRadioButton radioButton3 = new JRadioButton("optie3");
    private boolean crossPlatform = true;
    private JLabel label3;

    public Display() {
        getFrame();
    }

    public JFrame getFrame() {
        if (frame == null) {
            frame = new JFrame();
            frame.setSize(300, 200);
            frame.setContentPane(getContentPane());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        /*try {
            if (crossPlatform)
                UIManager.setLookAndFeel(UIManager
                        .getCrossPlatformLookAndFeelClassName());
            else
                UIManager.setLookAndFeel(UIManager
                        .getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(frame); */
        frame.setVisible(true);
        return frame;    }

    private JPanel getContentPane() {
        if (contentPane == null) {
            contentPane = new JPanel();
            contentPane.setPreferredSize(new Dimension(500, 500));
            contentPane.setLayout(new GridLayout(4, 1));
            contentPane.add(getSmallPanel2());
            contentPane.add(getSmallPanel3());
            contentPane.add(getSmallPanel4());
            contentPane.add(getSmallPanel1());

        }
        return contentPane;
    }

    public JButton getButton() {
        return new JButton("Click me");
    }

    public JTextField getTextField() {
        return new JTextField(20);
    }

    public JLabel getLabel() {
        if (label == null) {
            label = new JLabel("Vaste tekst");
        }
        return label;
    }

    public JLabel getLabel2() {
        if (label2 == null) {
            label2 = new JLabel("Naam: ");
        }
        return label2;
    }

    public JLabel getLabel3() {
        if (label3 == null) {
            label3 = new JLabel("Age: ");
        }
        return label3;
    }

    public JRadioButton getRadioButton1() {
        return new JRadioButton("Man");
    }

    public JRadioButton getRadioButton2() {
        return new JRadioButton("Woman");
    }

    public JRadioButton getRadioButton3() {
        return new JRadioButton("Other");
    }

    public ButtonGroup getButtonGroup() {
        buttonGroup = new ButtonGroup();
        buttonGroup.add(getRadioButton1());
        buttonGroup.add(getRadioButton2());
        buttonGroup.add(getRadioButton3());
        return buttonGroup;
    }

    public JCheckBox getCheckBox() {
        if (checkBox == null) {
            checkBox = new JCheckBox("Vinken");
        }
        return checkBox;
    }

    public JComboBox<Integer> getComboBox() {
        if (comboBox == null) {
            ArrayList<Integer> content = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                content.add(i);
            }
            Iterator<Integer> iter = content.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());

            }
            comboBox = new JComboBox(content.toArray());
        }
        return comboBox;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JPanel getSmallPanel1() {
        if (smallPanel1 == null) {
            smallPanel1 = new JPanel();
            smallPanel1.add(getVerySmallPanel());
        }
        return smallPanel1;
    }

    public JPanel getSmallPanel2() {
        if (smallPanel2 == null) {
            smallPanel2 = new JPanel();
            smallPanel2.add(getLabel2());
            smallPanel2.add(getTextField());
        }
        return smallPanel2;
    }

    public JPanel getSmallPanel3() {
        if (smallPanel3 == null) {
            smallPanel3 = new JPanel();
            smallPanel3.add(getLabel());
            //smallPanel3.add(getButtonGroup());

            smallPanel3.add(getRadioButton1());
            smallPanel3.add(getRadioButton2());
            smallPanel3.add(getRadioButton3());

        }
        return smallPanel3;    }

    public JPanel getSmallPanel4() {
        if (smallPanel4 == null) {
            smallPanel4 = new JPanel();
            smallPanel4.add(getLabel3());
            smallPanel4.add(getComboBox());
        }
        return smallPanel4;
    }

    public JPanel getVerySmallPanel() {
        if (verySmallPanel == null) {
            verySmallPanel = new JPanel();
            verySmallPanel.add(getButton());
        }
        return verySmallPanel;
    }

    public static void main(String[] args) {
        new Display();
    }
}


