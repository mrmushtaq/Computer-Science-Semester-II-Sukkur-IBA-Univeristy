import java.awt.*;
import javax.swing.*;

class Details
{
	JFrame frame = new JFrame();
	Container c = frame.getContentPane();
	
	JLabel topic, ID, name, gender, province, hobbies, submission;
	JTextField IDField, nameField;
	JComboBox provinceField;
	JRadioButton genMale, genFemale, genAnyOther;
	JCheckBox hobCricket, hobFootball, hobReading, hobAnyOther;
	JButton subButton;
	
	Details()
	{
		c.setLayout(new BorderLayout());

		topic = new JLabel("My Bio Form");
		topic.setHorizontalAlignment(SwingConstants.CENTER);
		topic.setFont(new Font("Arial", Font.BOLD, 20));
		c.add(topic, BorderLayout.NORTH);

		JPanel formPanel = new JPanel(new GridLayout(7,2,5,5));
		ID = new JLabel("User ID");
		ID.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(ID);
		c.add(formPanel, BorderLayout.CENTER);

		IDField = new JTextField(10);
		IDField.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(IDField);

		name = new JLabel("Name");
		name.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(name);

		nameField = new JTextField(10);
		nameField.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(nameField);


		province = new JLabel("Province");
		province.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(province);

		String p[]={"Sindh", "Punjab", "KPK", "Balochistan"};
		provinceField = new JComboBox <> (p);
		provinceField.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(provinceField);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(gender);

		genMale = new JRadioButton("Male");
		genMale.setFont(new Font("Arial",Font.PLAIN,20));
		genFemale = new JRadioButton("Female");
		genFemale.setFont(new Font("Arial",Font.PLAIN,20));
		genAnyOther = new JRadioButton("Any Other");
		genAnyOther.setFont(new Font("Arial",Font.PLAIN,20));

		ButtonGroup genderGroup = new ButtonGroup();
			genderGroup.add(genMale);
			genderGroup.add(genFemale);
			genderGroup.add(genAnyOther);

		JPanel genPanel = new JPanel();
		genPanel.add(genMale);
		genPanel.add(genFemale);
		genPanel.add(genAnyOther);
		
		formPanel.add(genPanel);

		hobbies = new JLabel("Hobbies");
		hobbies.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(hobbies);

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
		hobPanel.add(hobAnyOther);
		
		formPanel.add(hobPanel);
	
		submission = new JLabel("Submission");
		submission.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(submission);

		subButton = new JButton("Submit");
		subButton.setFont(new Font("Arial",Font.PLAIN,20));
		formPanel.add(subButton);

		frame.setSize(900,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
}

public class FormB
{
	public static void main(String args[])
	{
		Details d = new Details();
	}
}