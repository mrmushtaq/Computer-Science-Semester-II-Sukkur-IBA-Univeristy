import javax.swing.*;
import java.awt.*;

public class M {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JTextArea Example");

        // Create a JTextArea
        JTextArea textArea = new JTextArea(10, 30); // 10 rows, 30 columns
        textArea.setEditable(true); // Allow editing

        // Create a JScrollPane to contain the JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        // Add the JScrollPane to the frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the default close operation of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
