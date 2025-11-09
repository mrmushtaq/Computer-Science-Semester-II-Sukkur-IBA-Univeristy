import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Date Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button to pick a date
        JButton dateButton = new JButton("Pick a Date");
        dateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show a date picker dialog
                Date selectedDate = (Date) JOptionPane.showInputDialog(
                        frame,
                        "Pick a Date:",
                        "Date Picker",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        new Date());

                // Display the selected date
                if (selectedDate != null) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    JOptionPane.showMessageDialog(frame, "Selected Date: " + dateFormat.format(selectedDate));
                }
            }
        });

        frame.getContentPane().add(dateButton);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
