import java.awt.*;
import javax.swing.*;


class Data 
{
	JFrame frame = new JFrame("Bus Tickets");
	Container c = frame.getContentPane();
	
	JLabel topic, name, source, destination, passengers, time, date, summary, amout;
	JTextField nameF, passengersF, dateF;
	JComboBox sourceF,destinationF, timeF;
	JButton submit, cancel;

	Data()
	{
		c.setLayout(new BorderLayout());
		
		topic = new JLabel("Welcome to Bus Booking System");
		topic.setHorizontalAlignment(SwingConstants.CENTER);
		topic.setFont(new Font("Arial", Font.BOLD, 25));
		c.add(topic, BorderLayout.NORTH);


		JPanel dataPanel = new JPanel(new GridBagLayout());
		c.add(dataPanel, BorderLayout.CENTER);

		GridBagConstraints gbc = new GridBagConstraints();
	 	
		gbc.gridy = 0;	gbc.gridx = 0;
		name = new JLabel("Name of User");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(name, gbc);

		gbc.gridx = 1;
		nameF = new JTextField(10);
		nameF.setHorizontalAlignment(SwingConstants.CENTER);
		nameF.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(nameF, gbc);
		nameF.addActionListener(this);

		gbc.gridy++;	gbc.gridx = 0;
		source = new JLabel("Source");
		source.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(source, gbc);

		gbc.gridx = 1;
		String [] cities = {"Sukkur","Karachi","Hayderabad","Quettta","Multan","Peshawar","Lahore","Islamabad"};
		sourceF = new JComboBox <>(cities);
		sourceF.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(sourceF, gbc);
		sourceF.addActionListener(this);

		gbc.gridy++;	gbc.gridx = 0;
		destination = new JLabel("Destination");
		destination.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(destination, gbc);

		gbc.gridx = 1;
		destinationF = new JComboBox <>(cities);
		destinationF.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(destinationF, gbc);
		destinationF.addActionListener(this);

		gbc.gridy++;	gbc.gridx = 0;
		time = new JLabel("Time");
		time.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(time, gbc);
		
		gbc.gridx = 1;
		String[] t = {"12:00 pm","2:00 pm","6:00 pm","10:30 pm","11:30 pm","1:00 am"};
		timeF = new JComboBox <>(t);
		timeF.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(timeF, gbc);
		timeF.addActionListener(this);

		gbc.gridy++;	gbc.gridx = 0;
		date = new JLabel("Departure Date");
		date.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(date, gbc);
		
		gbc.gridx = 1;
		dateF = new JTextField(10);
		dateF.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(dateF, gbc);
		dateF.addActionListener(this);

		gbc.gridy++;	gbc.gridx = 0;
		passengers = new JLabel("Number of Passenger");
		passengers.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(passengers, gbc);
		
		gbc.gridx = 1;
		passengersF = new JTextField(10);
		passengersF.setFont(new Font("Arial", Font.PLAIN, 22));
		dataPanel.add(passengersF, gbc);
		passendersF.addActionListener(this);

		JPanel subPanel = new JPanel();
		subPanel.setLayout(new FlowLayout());
		c.add(subPanel, BorderLayout.SOUTH);

		gbc.gridy++;	gbc.gridx = 0;
		submit = new JButton("Submit");
		submit.setFont(new Font("Arial", Font.PLAIN, 22));
		subPanel.add(submit, gbc);
		submit.addActionListener(this);
		
		cancel = new JButton("Cancel");
		cancel.setFont(new Font("Arial", Font.PLAIN, 22));
		subPanel.add(cancel, gbc);
		cancel.addActionListener(this);

		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);	
		frame.setVisible(true);
	}
}

public class Project
{
	public static void main(String args[])
	{
		Data d = new Data();
	}
}