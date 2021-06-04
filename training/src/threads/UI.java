package threads;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JSlider slider;
    JLabel label;
    JButton buttonStart;
    JButton buttonStop;

    public UI() {
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.slider = new JSlider(0,100, 0);
        this.label = new JLabel(slider.getValue() + "°C");
        this.buttonStart = new JButton("Start");
        this.buttonStop = new JButton("Stop");

        slider.addChangeListener(this);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);
        frame.add(panel);
        panel.add(slider);
        panel.add(label);
        panel.add(buttonStart);
        panel.add(buttonStop);
        SimpleThread thread = new SimpleThread();
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (thread.isInterrupted()) {
                    thread.start();
                } else {
                    thread.start();
                }
            }
        });
        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread.checkAccess();
                thread.interrupt();
            }
        });
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
            label.setText(slider.getValue() + "°C");
    }
}
