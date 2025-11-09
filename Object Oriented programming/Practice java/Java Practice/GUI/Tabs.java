
import javax.swing.*;

public class Tabs {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create and set up the window
        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each tab
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        // Add components to panels
        panel1.add(new JLabel("This is Panel 1"));
        panel2.add(new JLabel("This is Panel 2"));
        panel3.add(new JLabel("This is Panel 3"));

        // Add panels to the tabbed pane with tab titles
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);

        // Add the tabbed pane to the content pane
        frame.getContentPane().add(tabbedPane);

        // Set the size and make the window visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
