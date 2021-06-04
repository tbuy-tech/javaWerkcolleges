package thermometer;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ThermoSlider implements ChangeListener {

    JFrame frame;
    JSlider slider;
    JPanel panel;
    JLabel label;

    public ThermoSlider() {
        this.frame = new JFrame();
        this.slider = new JSlider(0,100, 50);
        this.panel = new JPanel();
        this.label = new JLabel(slider.getValue() + "°C");
        slider.setPreferredSize(new Dimension(400,300));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setFont(new Font("MV Boli",Font.PLAIN,25));


        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ThermoSlider();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(slider.getValue() + "°C");
    }
}
