import java.awt.*;
import javax.swing.*;

class Details {
    JFrame frame = new JFrame("My First Assignment");
    Container c = frame.getContentPane();

    JLabel topic, ID, name, gender, province, hobbies, address, submission;
    JTextField IDField, nameField;
    JComboBox<String> provinceField;
    JRadioButton genMale, genFemale;
    JCheckBox hobCricket, hobFootball, hobReading, hobAnyOther;
    JButton subButton, canButton;
    JTextArea areaField;

    Details() {
        c.setLayout(new BorderLayout());
	
        topic = new JLabel("My Bio Form");
        topic.setHorizontalAlignment(SwingConstants.CENTER);
        topic.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(topic, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());


        GridBagConstraints gbc = new GridBagConstraints();   

        ID = new JLabel("User ID");
        ID.setFont(new Font("Arial", Font.PLAIN, 20));

	gbc.gridx = 0;    // 1st row
        gbc.gridy = 0;     // 1st coloum  
        formPanel.add(ID, gbc);

        IDField = new JTextField(20);
        IDField.setFont(new Font("Arial", Font.PLAIN, 20));

        gbc.gridx = 1;        // 2nd coloum
        formPanel.add(IDField, gbc);

        
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));

	gbc.gridy++;          // 2nd row   (for new row)
        gbc.gridx = 0;        // 1st coloums
        formPanel.add(name, gbc);

        nameField = new JTextField(20);
        nameField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;		// 2nd coloum
        formPanel.add(nameField, gbc);

        // Add other components similarly...

	gbc.gridy++;             // 3rd row
        gbc.gridx = 0;		// 1st coloum

       
        submission = new JLabel("Submission");
        submission.setFont(new Font("Arial", Font.PLAIN, 20));
        formPanel.add(submission, gbc);

	gbc.gridx = 1;		// 2nd coloum

        JPanel subPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        subButton = new JButton("Submit");
        subButton.setFont(new Font("Arial", Font.PLAIN, 20));
        canButton = new JButton("Cancel");
        canButton.setFont(new Font("Arial", Font.PLAIN, 20));
        subPanel.add(subButton);
        subPanel.add(new JLabel("              "));
        subPanel.add(canButton);
        formPanel.add(subPanel, gbc);

        c.add(formPanel, BorderLayout.CENTER);

        frame.setSize(900, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class Form1 {
    public static void main(String args[]) 
	{
              Details d = new Details();
	}
}
