import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Youtube {

    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame("Smartphone Homescreen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 900);

        // Create a JPanel to hold the background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("background_1.jpg");
                Image image = icon.getImage();
                int screenWidth = getWidth();
                int screenHeight = getHeight();
                double imageAspectRatio = (double) image.getWidth(null) / image.getHeight(null);
                double screenAspectRatio = (double) screenWidth / screenHeight;
                int imageWidth;
                int imageHeight;
                int x;
                int y;
                if (screenAspectRatio > imageAspectRatio) {
                    imageWidth = screenWidth;
                    imageHeight = (int) (imageWidth / imageAspectRatio);
                    x = 0;
                    y = (screenHeight - imageHeight) / 2;
                } else {
                    imageHeight = screenHeight;
                    imageWidth = (int) (imageHeight * imageAspectRatio);
                    x = (screenWidth - imageWidth) / 2;
                    y = 0;
                }
                g.drawImage(image, x, y, imageWidth, imageHeight, null);
            }
        };

        // Add buttons and other components to the JPanel
        JButton button1 = new JButton("YouTube");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com"));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);

        // Add the JPanel to the JFrame and show the window
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
