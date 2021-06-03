package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    public static void main(String[] args) {
        Display display = new Display();

        display.getSom().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                if (display.getal1Invoer.getText().equals("") || display.getal2Invoer.getText().equals("")) {
                    display.showPopUp();
                } else {
                    display.getResultaatInvoer().setText(String.valueOf(new Berekening(Float.valueOf(display.getal1Invoer.getText()).floatValue(), Float.valueOf(display.getal2Invoer.getText()).floatValue()).som()));
                }
            }
        });
        display.getVerschil().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if (display.getal1Invoer.getText().equals("") || display.getal2Invoer.getText().equals("")) {
                    display.showPopUp();
                } else {
                    display.getResultaatInvoer().setText(String.valueOf(new Berekening(Float.valueOf(display.getal1Invoer.getText()).floatValue(), Float.valueOf(display.getal2Invoer.getText()).floatValue()).verschil()));
                }
            }
        });
        display.getMaal().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if (display.getal1Invoer.getText().equals("") || display.getal2Invoer.getText().equals("")) {
                    display.showPopUp();
                } else {
                    display.getResultaatInvoer().setText(String.valueOf(new Berekening(Float.valueOf(display.getal1Invoer.getText()).floatValue(), Float.valueOf(display.getal2Invoer.getText()).floatValue()).maal()));
                }
            }
        });
        display.getDeel().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (display.getal1Invoer.getText().equals("") || display.getal2Invoer.getText().equals("")) {
                    display.showPopUp();
                } else {
                    display.getResultaatInvoer().setText(String.valueOf(new Berekening( Float.valueOf(display.getal1Invoer.getText()).floatValue(), Float.valueOf(display.getal2Invoer.getText()).floatValue()).deel()));
                }
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
