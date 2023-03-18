import javax.swing.*;
import java.awt.*;

public class HomeScreen extends JFrame {

    public HomeScreen() {
        // Set the title of the JFrame
        setTitle("Smartphone Home Screen");
        
        // Set the layout manager to BorderLayout
        setLayout(new BorderLayout());
        
        // Create a JLabel to hold the background image
        JLabel background = new JLabel(new ImageIcon("path/to/your/image.jpg"));
        
        // Set the size and position of the JLabel
        background.setBounds(0, 0, getWidth(), getHeight());
        
        // Add the JLabel to the content pane
        getContentPane().add(background);
        
        // Set the size of the JFrame
        setSize(500, 800);
        
        // Set the JFrame to be visible
        setVisible(true);
    }
    
    public static void main(String[] args) {
        HomeScreen homeScreen = new HomeScreen();
    }
}
