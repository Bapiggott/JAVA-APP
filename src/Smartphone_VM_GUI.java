import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Smartphone_VM_GUI extends JFrame {
    
    private int batteryLevel;
    private String currentApp;
    private boolean isOn;

    private JLabel statusLabel;
    private JLabel batteryLabel;
    private JButton powerButton;
    private JButton cameraButton;
    private JButton galleryButton;
    private JButton musicButton;

    public Smartphone_VM_GUI() {
        batteryLevel = 100;
        currentApp = "Home Screen";
        isOn = false;

        statusLabel = new JLabel("Smartphone Virtual Machine is turned off");
        batteryLabel = new JLabel("Battery Level: " + batteryLevel + "%");
        powerButton = new JButton("Power");
        cameraButton = new JButton("Camera");
        galleryButton = new JButton("Gallery");
        musicButton = new JButton("Music");

        powerButton.addActionListener(new PowerButtonListener());
        cameraButton.addActionListener(new CameraButtonListener());
        galleryButton.addActionListener(new GalleryButtonListener());
        musicButton.addActionListener(new MusicButtonListener());

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(cameraButton);
        panel.add(galleryButton);
        panel.add(musicButton);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(statusLabel, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(powerButton, BorderLayout.SOUTH);
        contentPane.add(batteryLabel, BorderLayout.EAST);

        pack();
        setVisible(true);
    }

    private void turnOn() {
        isOn = true;
        statusLabel.setText("Smartphone Virtual Machine is turned on");
    }

    private void turnOff() {
        isOn = false;
        statusLabel.setText("Smartphone Virtual Machine is turned off");
        currentApp = "Home Screen";
    }

    private void openApp(String appName) {
        if (isOn) {
            currentApp = appName;
            statusLabel.setText("Opened " + appName);
        } else {
            statusLabel.setText("Cannot open app, Smartphone Virtual Machine is turned off");
        }
    }

    private void closeApp() {
        if (isOn) {
            currentApp = "Home Screen";
            statusLabel.setText("Closed " + currentApp);
        } else {
            statusLabel.setText("Cannot close app, Smartphone Virtual Machine is turned off");
        }
    }

    private void checkBatteryLevel() {
        batteryLabel.setText("Battery Level: " + batteryLevel + "%");
    }

    private class PowerButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (isOn) {
                turnOff();
            } else {
                turnOn();
            }
        }
    }

    private class CameraButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            openApp("Camera");
        }
    }

    private class GalleryButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            openApp("Gallery");
        }
    }

    private class MusicButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            openApp("Music");
        }
    }

    public static void main(String[] args) {
        Smartphone_VM_GUI vm = new Smartphone_VM_GUI();
    }
}
