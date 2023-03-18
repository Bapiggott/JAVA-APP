import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class YoutubeGUIExample {

    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame("YouTube GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a JPanel to hold the browser component
        JPanel panel = new JPanel(new BorderLayout());

        // Create a browser component to display YouTube
        JEditorPane browser = new JEditorPane();
        browser.setEditable(false);
        try {
            browser.setPage("https://www.google.com");
        } catch (IOException e) {
            e.printStackTrace();
        }
        JScrollPane scrollPane = new JScrollPane(browser);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Add the JPanel to the JFrame and show the window
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
