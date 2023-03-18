import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SmartphoneHomeScreen extends JFrame {
    
    public SmartphoneHomeScreen() {
        super("Smartphone Home Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(300, 500));
        
        JPanel homePanel = new JPanel(new BorderLayout());
        homePanel.setBackground(Color.WHITE);
        
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.setBackground(Color.WHITE);
        
        JLabel timeLabel = new JLabel("12:00 PM");
        topPanel.add(timeLabel, BorderLayout.WEST);
        
        ImageIcon batteryIcon = new ImageIcon("battery.png");
        JLabel batteryLabel = new JLabel(batteryIcon);
        topPanel.add(batteryLabel, BorderLayout.EAST);
        
        homePanel.add(topPanel, BorderLayout.NORTH);
        
        JPanel appPanel = new JPanel(new GridLayout(4, 3, 10, 10));
        appPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        appPanel.setBackground(Color.WHITE);
        
        ImageIcon phoneIcon = new ImageIcon("phone.png");
        JLabel phoneLabel = new JLabel(phoneIcon);
        appPanel.add(phoneLabel);
        
        ImageIcon messagesIcon = new ImageIcon("messages.png");
        JLabel messagesLabel = new JLabel(messagesIcon);
        appPanel.add(messagesLabel);
        
        ImageIcon contactsIcon = new ImageIcon("contacts.png");
        JLabel contactsLabel = new JLabel(contactsIcon);
        appPanel.add(contactsLabel);
        
        ImageIcon cameraIcon = new ImageIcon("camera.png");
        JLabel cameraLabel = new JLabel(cameraIcon);
        appPanel.add(cameraLabel);
        
        ImageIcon photosIcon = new ImageIcon("photos.png");
        JLabel photosLabel = new JLabel(photosIcon);
        appPanel.add(photosLabel);
        
        ImageIcon settingsIcon = new ImageIcon("settings.png");
        JLabel settingsLabel = new JLabel(settingsIcon);
        appPanel.add(settingsLabel);
        
        ImageIcon calculatorIcon = new ImageIcon("calculator.png");
        JLabel calculatorLabel = new JLabel(calculatorIcon);
        appPanel.add(calculatorLabel);
        
        ImageIcon mapsIcon = new ImageIcon("maps.png");
        JLabel mapsLabel = new JLabel(mapsIcon);
        appPanel.add(mapsLabel);
        
        ImageIcon musicIcon = new ImageIcon("music.png");
        JLabel musicLabel = new JLabel(musicIcon);
        appPanel.add(musicLabel);
        
        ImageIcon browserIcon = new ImageIcon("browser.png");
        JLabel browserLabel = new JLabel(browserIcon);
        appPanel.add(browserLabel);
        
        ImageIcon weatherIcon = new ImageIcon("weather.png");
        JLabel weatherLabel = new JLabel(weatherIcon);
        appPanel.add(weatherLabel);
        
        homePanel.add(appPanel, BorderLayout.CENTER);
        
        setContentPane(homePanel);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SmartphoneHomeScreen();
    }
}
