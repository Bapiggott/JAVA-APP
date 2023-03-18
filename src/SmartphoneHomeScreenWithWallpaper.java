import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SmartphoneHomeScreenWithWallpaper extends JFrame {
    
    private Image wallpaperImage;
    
    public SmartphoneHomeScreenWithWallpaper() {
        super("Smartphone Home Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(300, 500));
        
        // Load wallpaper image
        wallpaperImage = new ImageIcon("wallpaper.png").getImage();
        
        JPanel homePanel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(wallpaperImage, 0, 0, null);
            }
        };
        homePanel.setBackground(Color.WHITE);
        
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.setBackground(new Color(0, 0, 0, 150));
        
        JLabel timeLabel = new JLabel("12:00 PM");
        timeLabel.setForeground(Color.WHITE);
        topPanel.add(timeLabel, BorderLayout.WEST);
        
        ImageIcon batteryIcon = new ImageIcon("battery.png");
        JLabel batteryLabel = new JLabel(batteryIcon);
        topPanel.add(batteryLabel, BorderLayout.EAST);
        
        homePanel.add(topPanel, BorderLayout.NORTH);
        
        JPanel appPanel = new JPanel(new GridLayout(4, 3, 10, 10));
        appPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        appPanel.setOpaque(false);
        
        ImageIcon phoneIcon = new ImageIcon("phone.png");
        JLabel phoneLabel = new JLabel(phoneIcon);
        appPanel.add(phoneLabel);
        
        ImageIcon messagesIcon = new ImageIcon("messages.png");
        JLabel messagesLabel = new JLabel(messagesIcon);
        appPanel.add(messagesLabel);
        
        ImageIcon contactsIcon = new ImageIcon("contacts.png");
        JLabel contactsLabel = new JLabel(contactsIcon);
        appPanel.add(contactsLabel);
        
        ImageIcon safariIcon = new ImageIcon("safari.png");
        JLabel safariLabel = new JLabel(safariIcon);
        appPanel.add(safariLabel);
        
        ImageIcon musicIcon = new ImageIcon("music.png");
        JLabel musicLabel = new JLabel(musicIcon);
        appPanel.add(musicLabel);
        
        ImageIcon photosIcon = new ImageIcon("photos.png");
        JLabel photosLabel = new JLabel(photosIcon);
        appPanel.add(photosLabel);
        
        ImageIcon mapsIcon = new ImageIcon("maps.png");
        JLabel mapsLabel = new JLabel(mapsIcon);
        appPanel.add(mapsLabel);
        
        ImageIcon cameraIcon = new ImageIcon("camera.png");
        JLabel cameraLabel = new JLabel(cameraIcon);
        appPanel.add(cameraLabel);
        
        ImageIcon weatherIcon = new ImageIcon("weather.png");
        JLabel weatherLabel = new JLabel(weatherIcon);
        appPanel.add(weatherLabel);
        
        ImageIcon calculatorIcon = new ImageIcon("calculator.png");
        JLabel calculatorLabel = new JLabel(calculatorIcon);
        appPanel.add(calculatorLabel);
        
        ImageIcon clockIcon = new ImageIcon("clock.png");
        JLabel clockLabel = new JLabel(clockIcon);
        appPanel.add(clockLabel);
        
        homePanel.add(appPanel, BorderLayout.CENTER);
        
        setContentPane(homePanel);
        
        // Center the frame on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreen
