
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PageNavigationExample {

    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public PageNavigationExample() {
        frame = new JFrame("Page Navigation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with CardLayout
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Add pages to the cardPanel
        cardPanel.add(createPage1(), "Page 1");
        cardPanel.add(createPage2(), "Page 2");

        frame.add(cardPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel createPage1() {
        JPanel panel = new JPanel();
        JButton nextPageButton = new JButton("Next Page");
        nextPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Page 2");
            }
        });
        panel.add(new JLabel("Page 1"));
        panel.add(nextPageButton);
        return panel;
    }

    private JPanel createPage2() {
        JPanel panel = new JPanel();
        JButton prevPageButton = new JButton("Previous Page");
        prevPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Page 1");
            }
        });
        panel.add(new JLabel("Page 2"));
        panel.add(prevPageButton);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PageNavigationExample();
            }
        });
    }
}
