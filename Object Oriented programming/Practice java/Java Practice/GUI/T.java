
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class D implements ActionListener
{
    JFrame frame;
    Container c;

    String Sseats, Sname, Snumber, Stype, Sdate, Stime, Spreferences, Ssource, Sdes, SAddress;

    JLabel topic, seats, name, number, type, source, destination, date, time, preferences, address;
    JTextField seatField, nameField, numberField, areaField, dateField;
    JComboBox<String> sourceField, desField, timeField;
    JRadioButton single, Return;
    JCheckBox preSeatSelection, preMeal, preExtraLuggage, preWifi, jb;
    JButton checkRecord, subButton, canButton, preButton, back, newBooking;

    CardLayout cardLayout;
    JPanel cardPanel;

    public D() {
        frame = new JFrame("My First Project");
        c = frame.getContentPane();

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Create home page and Booking page
        
        cardPanel.add(createHomePage(), "Home Page");
        cardPanel.add(createRecordPage(), "Record Page");
        cardPanel.add(createBookingPage(), "Booking Page");
        cardPanel.add(SubmittedPage(), "Submitted Page");

        // Add card panel to content pane
        c.add(cardPanel);

        frame.setSize(1200, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private JPanel createHomePage() {
        JPanel homePanel = new JPanel();
        homePanel.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        p.setBackground(Color.LIGHT_GRAY);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel l = new JLabel("WELCOME TO THE BUS TICKET BOOKING SYSTEM");
        l.setHorizontalAlignment(l.CENTER);
        l.setFont(new Font("Arial", Font.BOLD, 40));

        gbc.gridy++;
        JTextArea infoArea = new JTextArea();
        infoArea.setBackground(Color.LIGHT_GRAY);
        infoArea.setText("Thank you for choosing to travel with us!\n\n"
                + "Please click the 'booking' button below to start the booking process.");
        infoArea.setFont(new Font("Arial", Font.PLAIN, 16));
        infoArea.setEditable(false);
        infoArea.setWrapStyleWord(true);

        p.add(l, gbc);
        gbc.gridy++;
        p.add(new JLabel(" "), gbc);
        gbc.gridy++;
        p.add(new JLabel(" "), gbc);
        gbc.gridy++;
        p.add(infoArea, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        p.add(new JLabel(" "), gbc);

        newBooking = new JButton("New Booking");
        newBooking.setPreferredSize(new Dimension(150, 40));
        newBooking.setHorizontalAlignment(newBooking.CENTER);
        newBooking.setBackground((Color.GREEN));
        gbc.gridy++;


        newBooking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Booking Page");
            }
        });

        checkRecord = new JButton("Check Records");
        checkRecord.setPreferredSize(new Dimension(150, 40));
        checkRecord.setHorizontalAlignment(newBooking.CENTER);
        checkRecord.setBackground((Color.GREEN));
    
        JPanel BRpanel = new JPanel();
        BRpanel.add(newBooking);
        BRpanel.add(checkRecord);
        p.add(BRpanel, gbc);

        checkRecord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Record Page");
            }
        });

        homePanel.add(new JLabel(), BorderLayout.NORTH);
        homePanel.add(p, BorderLayout.CENTER);
        return homePanel;
    }

    private JPanel createRecordPage(){

        JPanel recPanel = new JPanel();
        recPanel.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setBackground(Color.LIGHT_GRAY);
        p.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        recPanel.add(p, BorderLayout.CENTER);
        return recPanel;
    }

    private JPanel createBookingPage() {

        topic = new JLabel("Bus Ticket Booking System");
        topic.setHorizontalAlignment(SwingConstants.CENTER);
        topic.setFont(new Font("Arial", Font.BOLD, 30));
        c.add(topic, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 40, 8, 5); // Add padding between components
        gbc.anchor = GridBagConstraints.LINE_START; // Align components to the left

        seats = new JLabel("No: of Seats ");
        seats.setFont(new Font("Arial", Font.PLAIN, 20));
        seats.setForeground(Color.WHITE);   // Font Colour
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(seats, gbc);

        seatField = new JTextField(20);
        seatField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(seatField, gbc);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(name, gbc);

        nameField = new JTextField(20);
        nameField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(nameField, gbc);

        number = new JLabel("Contact # ");
        number.setFont(new Font("Arial", Font.PLAIN, 20));
        number.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(number, gbc);

        numberField = new JTextField(20);
        numberField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(numberField, gbc);

        source = new JLabel("Source");
        source.setForeground(Color.WHITE);
        source.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(source, gbc);

        String p[] = {"   Sukkur", "   Karachi", "   Lahore", "   Quetta", "   Multan", "   Islamabad", "   Peshawar"};
        sourceField = new JComboBox<>(p);
        sourceField.setPreferredSize(new Dimension(325, 30));
        sourceField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(sourceField, gbc);

        destination = new JLabel("Destination");
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(destination, gbc);

        desField = new JComboBox<>(p);
        desField.setPreferredSize(new Dimension(325, 30));
        desField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(desField, gbc);

        date = new JLabel("Booking Date ");
        date.setFont(new Font("Arial", Font.PLAIN, 20));
        date.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(date, gbc);

        dateField = new JTextField(20);
        dateField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(dateField, gbc);

        time = new JLabel("Time");
        time.setFont(new Font("Arial", Font.PLAIN, 20));
        time.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(time, gbc);

        String t[] = {"   12:00 p.m", "   02:00 p.m", "   06:00 p.m", "   08:00 p.m", "   10:30 p.m", "   01:00 a.m"};
        timeField = new JComboBox<>(t);
        timeField.setFont(new Font("Arial", Font.PLAIN, 20));
        timeField.setPreferredSize(new Dimension(325, 30));
        gbc.gridx = 1;
        formPanel.add(timeField, gbc);

        type = new JLabel("Type");
        type.setForeground(Color.WHITE);
        type.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(type, gbc);

        single = new JRadioButton("Single");
        single.setPreferredSize(new Dimension(157, 30));
        single.setFont(new Font("Arial", Font.PLAIN, 20));
        Return = new JRadioButton("Return");
        Return.setPreferredSize(new Dimension(157, 30));
        Return.setFont(new Font("Arial", Font.PLAIN, 20));

        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(single);
        typeGroup.add(Return);

        JPanel typePanel = new JPanel();
        typePanel.add(single);
        typePanel.add(Return);
        gbc.gridx = 1;
        formPanel.add(typePanel, gbc);

        preferences = new JLabel("Preferences");
        preferences.setFont(new Font("Arial", Font.PLAIN, 20));
        preferences.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(preferences, gbc);

        preSeatSelection = new JCheckBox("Seat Selection");
        preSeatSelection.setFont(new Font("Arial", Font.PLAIN, 20));
        preMeal = new JCheckBox("Meal");
        preMeal.setFont(new Font("Arial", Font.PLAIN, 20));
        preExtraLuggage = new JCheckBox("Extra Luggage");
        preExtraLuggage.setFont(new Font("Arial", Font.PLAIN, 20));
        preWifi = new JCheckBox("Wifi Access");
        preWifi.setFont(new Font("Arial", Font.PLAIN, 20));

        JPanel prePanel = new JPanel(new GridLayout(2, 2));
        prePanel.setPreferredSize(new Dimension(325, 40));
        prePanel.add(preSeatSelection);
        prePanel.add(preMeal);
        prePanel.add(preExtraLuggage);
        prePanel.add(preWifi);
        gbc.gridx = 1;
        formPanel.add(prePanel, gbc);

        address = new JLabel("Address");
        address.setForeground(Color.WHITE);
        address.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.LINE_START;
        formPanel.add(address, gbc);

        areaField = new JTextField(20);
        areaField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(areaField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel(" "), gbc); // Empty space for separation

        jb = new JCheckBox("Accept terms and conditions");
        jb.setFont(new Font("Arial", Font.PLAIN, 20));
        jb.setBackground(Color.lightGray);
        jb.setHorizontalAlignment(SwingConstants.CENTER);
        jb.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy++;
        formPanel.add(jb, gbc);

        gbc.gridx = 1;
        gbc.gridy++;

        preButton = new JButton("Preview");
        preButton.setFont(new Font("Arial", Font.PLAIN, 20));
        preButton.addActionListener(this);

        subButton = new JButton("Submit");
        subButton.setFont(new Font("Arial", Font.PLAIN, 20));
        subButton.addActionListener(this);

        canButton = new JButton("Cancel");
        canButton.setFont(new Font("Arial", Font.PLAIN, 20));
        canButton.addActionListener(this);

        JPanel subPanel = new JPanel();

        subPanel.add(preButton);
        subPanel.add(new JLabel("  "));  // space between Preview and submit Button
        subPanel.add(subButton);
        subPanel.add(new JLabel("  "));  // space between submit and cancel Button
        subPanel.add(canButton);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(subPanel, gbc);

        c.add(formPanel, BorderLayout.CENTER);

        c.setBackground(Color.RED);
        formPanel.setBackground(Color.GRAY);
        subPanel.setBackground(Color.GRAY);

        typePanel.setBackground(Color.GRAY);
        subButton.setBackground(Color.GREEN);
        canButton.setBackground(Color.GREEN);
        preButton.setBackground(Color.GREEN);

        return formPanel;
    }

    private JPanel SubmittedPage() {

        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setBackground(Color.LIGHT_GRAY);
        p.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel l = new JLabel("Thank You!");
        l.setHorizontalAlignment(l.CENTER);
        l.setFont(new Font("Arial", Font.BOLD, 40));

        JLabel l1 = new JLabel("Your seats have been booked.");
        l1.setHorizontalAlignment(l.CENTER);
        l1.setFont(new Font("Arial", Font.PLAIN, 25));

        p.add(l, gbc);
        gbc.gridy++;
        p.add(l1, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        p.add(new JLabel(" "), gbc);

        gbc.gridy++;
        p.add(new JLabel(" "), gbc);

        JPanel jp = new JPanel();
        newBooking = new JButton("New Booking");
        newBooking.setPreferredSize(new Dimension(150, 40));
        newBooking.setBackground((Color.GREEN));
        gbc.gridy++;
        p.add(jp, gbc);

        back = new JButton("Home Page");
        back.setPreferredSize(new Dimension(150, 40));
        back.setBackground((Color.GREEN));
        jp.add(newBooking);
        jp.add(back);

        newBooking.addActionListener(this);
        back.addActionListener(this);

        subPanel.add(new JLabel(), BorderLayout.NORTH);
        subPanel.add(p, BorderLayout.CENTER);
        return subPanel;
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == back) {
            CancelData();
            cardLayout.show(cardPanel, "Home Page");
        } else if (event.getSource() == newBooking) {
            CancelData();
            cardLayout.show(cardPanel, "Booking Page");
        } else if (event.getSource() == preButton) {
            Summary();
        } else if (event.getSource() == subButton && (jb.isSelected())) {
            cardLayout.show(cardPanel, "Submitted Page");
        } else if (event.getSource() == subButton && !(jb.isSelected())) {
            JOptionPane.showMessageDialog(frame, "Please Accept terms and conditions");

        } else if (event.getSource() == canButton) {
            CancelData();
            cardLayout.show(cardPanel, "Home Page");

        }
    }

    public void CancelData() {

        seatField.setText(null);
        nameField.setText(null);
        numberField.setText(null);
        areaField.setText(null);
        dateField.setText(null);

        sourceField.setSelectedIndex(-1);
        desField.setSelectedIndex(-1);
        timeField.setSelectedIndex(-1);
        single.setSelected(false);
        Return.setSelected(false);
        preSeatSelection.setSelected(false);
        preMeal.setSelected(false);
        preExtraLuggage.setSelected(false);
        preWifi.setSelected(false);
        jb.setSelected(false);

    }

    public String Summary() {

        Sseats = seatField.getText();
        Sname = nameField.getText();
        Snumber = numberField.getText();
        Sdate = dateField.getText();
        Ssource = (String) sourceField.getSelectedItem();
        Sdes = (String) desField.getSelectedItem();
        Stime = (String) timeField.getSelectedItem();

        SAddress = areaField.getText();

        if (single.isSelected()) {
            Stype = "Single";
        } else if (Return.isSelected()) {
            Stype = "Return";
        }

        Spreferences = null;
        if (preSeatSelection.isSelected()) {
            Spreferences = "Seat Selection Choice";
        }
        if (preMeal.isSelected()) {
            Spreferences += " Meal ";
        }
        if (preExtraLuggage.isSelected()) {
            Spreferences += "   Extra Luggage";
        }
        if (preWifi.isSelected()) {
            Spreferences += "   Wifi";
        }

        String summary = "";
        summary += "No: of Seats: " + Sseats + "\nName:    " + Sname + "\nContact #: " + Snumber + "\ntype:   "
                + Stype + "\nSource:   " + Ssource + "\nDestination:   " + Sdes + "\nDate #: " + Sdate + "\nTime:   " + Stime + "\nPreferences: " + Spreferences + "\nAddress: " + SAddress;
        JOptionPane.showMessageDialog(frame, summary);

        return summary;
    }

}

public class T {

    public static void main(String args[]) {

        D d = new D();

    }

}
