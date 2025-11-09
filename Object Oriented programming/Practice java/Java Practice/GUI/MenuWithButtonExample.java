import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuWithButtonExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Menu with Button Example");

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu menu = new JMenu("File");

        // Create a JMenuItem
        JMenuItem menuItem = new JMenuItem("Open");

        // Add ActionListener to the JMenuItem
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Open File Dialog");
            }
        });

        // Add the JMenuItem to the JMenu
        menu.add(menuItem);

        // Add the JMenu to the JMenuBar
        menuBar.add(menu);

        // Add the JMenuBar to the JFrame
        frame.setJMenuBar(menuBar);

        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Add ActionListener to the JButton
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add the JButton to the JFrame
        frame.getContentPane().add(button, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
