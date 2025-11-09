import java.awt.*;
import javax.swing.*;

class Details
{
	JFrame frame = new JFrame("My First Assignment");
	Container c = frame.getContentPane();
	
	JLabel topic, ID, name, gender, province, hobbies, address, submission;
	JTextField IDField, nameField, areaField;
	JComboBox provinceField;
	JRadioButton genMale, genFemale;
	JCheckBox hobCricket, hobFootball, hobReading, hobAnyOther;
	JButton subButton, canButton;
	
	
	Details()
	{
		c.setLayout(new BorderLayout());

		topic = new JLabel("My Bio Form");
		topic.setHorizontalAlignment(SwingConstants.CENTER);
		topic.setFont(new Font("Arial", Font.BOLD, 20));
		c.add(topic, BorderLayout.NORTH);

		JPanel formPanel = new JPanel(new GridBagLayout());
		ID = new JLabel("User ID");
		ID.setFont(new Font("Arial",Font.PLAIN,20));

		GridBagConstraints gbc = new GridBagConstraints();

	        gbc.insets = new Insets(5, 5, 5, 5); // Add padding between components
	        gbc.anchor = GridBagConstraints.LINE_START; // Align components to the left

		gbc.gridx = 0;	gbc.gridy = 0;
		formPanel.add(ID, gbc);
		c.add(formPanel, BorderLayout.CENTER);

		IDField = new JTextField(20);
		IDField.setFont(new Font("Arial",Font.PLAIN,20));

		gbc.gridx = 1;
		formPanel.add(IDField, gbc);

		name = new JLabel("Name");
		name.setFont(new Font("Arial",Font.PLAIN,20));

		gbc.gridy = 1;     // New row
		gbc.gridx = 0;
		formPanel.add(name, gbc);

		nameField = new JTextField(20);
		nameField.setFont(new Font("Arial",Font.PLAIN,20));

		gbc.gridx = 1;
		formPanel.add(nameField, gbc);


		province = new JLabel("Province");
		province.setFont(new Font("Arial",Font.PLAIN,20));

		gbc.gridy++;     // New row
		gbc.gridx = 0;
		formPanel.add(province, gbc);

		String p[]={"Sindh", "Punjab", "KPK", "Balochistan"};
		provinceField = new JComboBox <> (p);
		provinceField.setFont(new Font("Arial",Font.PLAIN,20));

		gbc.gridx = 1;
		formPanel.add(provinceField, gbc);

		gbc.gridy++;     // New row
		gbc.gridx = 0;
		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(gender, gbc);

		genMale = new JRadioButton("Male");
		genMale.setFont(new Font("Arial",Font.PLAIN,20));
		genFemale = new JRadioButton("Female");
		genFemale.setFont(new Font("Arial",Font.PLAIN,20));

		ButtonGroup genderGroup = new ButtonGroup();
			genderGroup.add(genMale);
			genderGroup.add(genFemale);


		JPanel genPanel = new JPanel();
		genPanel.add(genMale);
		genPanel.add(genFemale);

		gbc.gridx = 1;
		formPanel.add(genPanel, gbc);

		hobbies = new JLabel("Hobbies");
		hobbies.setFont(new Font("Arial",Font.PLAIN,20));

		gbc.gridy++;     // New row
		gbc.gridx = 0;
		formPanel.add(hobbies, gbc);

		hobCricket = new JCheckBox("Cricket");
		hobCricket.setFont(new Font("Arial",Font.PLAIN,20));
		hobFootball = new JCheckBox("Football");
		hobFootball.setFont(new Font("Arial",Font.PLAIN,20));
		hobReading = new JCheckBox("Reading");
		hobReading.setFont(new Font("Arial",Font.PLAIN,20));
		hobAnyOther = new JCheckBox("Any Other");
		hobAnyOther.setFont(new Font("Arial",Font.PLAIN,20));

		JPanel hobPanel = new JPanel();
		hobPanel.add(hobCricket);
		hobPanel.add(hobFootball);
		hobPanel.add(hobReading);
		
		gbc.gridx = 1;
        	gbc.anchor = GridBagConstraints.CENTER;
		formPanel.add(hobPanel, gbc);

		gbc.gridy++;
		gbc.gridx = 0;
		formPanel.add(new JLabel(), gbc);

		gbc.gridx = 1;
		formPanel.add(hobAnyOther, gbc);

		address = new JLabel("Address");
		address.setFont(new Font("Arial",Font.PLAIN,20));

		gbc.gridy++;     // New row
		gbc.gridx = 0;
		formPanel.add(address, gbc);


		areaField = new JTextField(20);
		areaField.setFont(new Font("Arial",Font.PLAIN,20));

		gbc.gridx = 1;
		formPanel.add(areaField, gbc);


		gbc.gridy++;
		gbc.gridx = 0;
		formPanel.add(new JLabel(" "), gbc);

		gbc.gridy++;
		gbc.gridx = 0;
		formPanel.add(new JLabel(" "), gbc);

		

	
		submission = new JLabel("Submission");
		submission.setFont(new Font("Arial",Font.PLAIN,20));

		gbc.gridy++;     // New row
		gbc.gridx = 0;
		formPanel.add(submission, gbc);

		subButton = new JButton("Submit");
		subButton.setFont(new Font("Arial",Font.PLAIN,20));

		canButton = new JButton("Cancel");
		canButton.setFont(new Font("Arial",Font.PLAIN,20));
		
		JPanel subPanel = new JPanel();
		subPanel.add(new JLabel("         "));
		subPanel.add(subButton);
		subPanel.add(new JLabel("       "));  // space between submit and cancel Button
		subPanel.add(canButton);

		gbc.gridx = 1;
		formPanel.add(subPanel, gbc);

		frame.setSize(900,600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
}

public class Form
{
	public static void main(String args[])
	{
		Details d = new Details();
	}
}