
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class D implements ActionListener {

    JFrame frame;
    Container c;

    String SID, SFName, SLName, SGender, SHobbies, SProvince, SAddress;

    JLabel topic, ID, fname, lname, gender, province, hobbies, address;
    JTextField IDField, fnameField, lnameField, areaField;
    JComboBox<String> provinceField;
    JRadioButton genMale, genFemale;
    JCheckBox hobCricket, hobFootball, hobReading, hobAnyOther, jb;
    JButton subButton, canButton, preButton, back, rb;

    CardLayout cardLayout;
    JPanel cardPanel;

    public D() {
        frame = new JFrame("My First Assignment");
        c = frame.getContentPane();
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Create home page and registration page
        cardPanel.add(createHomePage(), "Home Page");
        cardPanel.add(createRegistrationPage(), "Registration Page");
        cardPanel.add(SubmittedPage(), "Submitted Page");

        // Add card panel to content pane
        c.add(cardPanel);

        frame.setSize(900, 600);
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

        JLabel l = new JLabel("WELCOME TO NEW REGISTRATION");
        l.setHorizontalAlignment(l.CENTER);
        l.setFont(new Font("Arial", Font.BOLD, 40));

        gbc.gridy++;
        JTextArea infoArea = new JTextArea();
        infoArea.setBackground(Color.LIGHT_GRAY);
        infoArea.setText("Thank you for choosing to register with us!\n\n"
                + "Please click the 'Register' button below to start the registration process.");
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

        JButton rb = new JButton("New Registration");
        rb.setPreferredSize(new Dimension(150, 40));
        rb.setHorizontalAlignment(rb.CENTER);
        rb.setBackground((Color.GREEN));
        gbc.gridy++;
        p.add(rb, gbc);

        rb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Registration Page");
            }
        });

        homePanel.add(new JLabel(), BorderLayout.NORTH);
        homePanel.add(p, BorderLayout.CENTER);
        return homePanel;
    }

    private JPanel createRegistrationPage() {

        topic = new JLabel("Registration Form");
        topic.setHorizontalAlignment(SwingConstants.CENTER);
        topic.setFont(new Font("Arial", Font.BOLD, 30));
        c.add(topic, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 40, 8, 5); // Add padding between components
        gbc.anchor = GridBagConstraints.LINE_START; // Align components to the left

        ID = new JLabel("User ID");
        ID.setFont(new Font("Arial", Font.PLAIN, 20));
        ID.setForeground(Color.WHITE);   // Font Colour
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(ID, gbc);

        IDField = new JTextField(20);
        IDField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(IDField, gbc);

        fname = new JLabel("First Name");
        fname.setFont(new Font("Arial", Font.PLAIN, 20));
        fname.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(fname, gbc);

        fnameField = new JTextField(20);
        fnameField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(fnameField, gbc);

        lname = new JLabel("Last Name");
        lname.setFont(new Font("Arial", Font.PLAIN, 20));
        lname.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(lname, gbc);

        lnameField = new JTextField(20);
        lnameField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(lnameField, gbc);

        province = new JLabel("Province");
        province.setForeground(Color.WHITE);
        province.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(province, gbc);

        String p[] = {"Sindh", "Punjab", "KPK", "Balochistan"};
        provinceField = new JComboBox<>(p);
        provinceField.setPreferredSize(new Dimension(325, 30));
        provinceField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        formPanel.add(provinceField, gbc);

        gender = new JLabel("Gender");
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(gender, gbc);

        genMale = new JRadioButton("Male");
        genMale.setPreferredSize(new Dimension(157, 30));
        genMale.setFont(new Font("Arial", Font.PLAIN, 20));
        genFemale = new JRadioButton("Female");
        genFemale.setPreferredSize(new Dimension(157, 30));
        genFemale.setFont(new Font("Arial", Font.PLAIN, 20));

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(genMale);
        genderGroup.add(genFemale);

        JPanel genPanel = new JPanel();
        genPanel.add(genMale);
        genPanel.add(genFemale);
        gbc.gridx = 1;
        formPanel.add(genPanel, gbc);

        hobbies = new JLabel("Hobbies");
        hobbies.setFont(new Font("Arial", Font.PLAIN, 20));
        hobbies.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(hobbies, gbc);

        hobCricket = new JCheckBox("Cricket");
        hobCricket.setFont(new Font("Arial", Font.PLAIN, 20));
        hobFootball = new JCheckBox("Football");
        hobFootball.setFont(new Font("Arial", Font.PLAIN, 20));
        hobReading = new JCheckBox("Reading");
        hobReading.setFont(new Font("Arial", Font.PLAIN, 20));
        hobAnyOther = new JCheckBox("Any Other");
        hobAnyOther.setFont(new Font("Arial", Font.PLAIN, 20));

        JPanel hobPanel = new JPanel(new GridLayout(2, 2));
        hobPanel.setPreferredSize(new Dimension(325, 40));
        hobPanel.add(hobCricket);
        hobPanel.add(hobFootball);
        hobPanel.add(hobReading);
        hobPanel.add(hobAnyOther);
        gbc.gridx = 1;
        formPanel.add(hobPanel, gbc);

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

        genPanel.setBackground(Color.GRAY);
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

        JLabel l1 = new JLabel("Your submission has been received.");
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
        rb = new JButton("New Registration");
        rb.setPreferredSize(new Dimension(150, 40));
        rb.setBackground((Color.GREEN));
        gbc.gridy++;
        p.add(jp, gbc);

        back = new JButton("Home Page");
        back.setPreferredSize(new Dimension(150, 40));
        back.setBackground((Color.GREEN));
        jp.add(rb);
        jp.add(back);

        rb.addActionListener(this);
        back.addActionListener(this);

        subPanel.add(new JLabel(), BorderLayout.NORTH);
        subPanel.add(p, BorderLayout.CENTER);
        return subPanel;
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == back) {
            CancelData();
            cardLayout.show(cardPanel, "Home Page");
        } else if (event.getSource() == rb) {
            CancelData();
            cardLayout.show(cardPanel, "Registration Page");
        } else if (event.getSource() == preButton) {
            Summary();
        } else if (event.getSource() == subButton && jb.isSelected()) {
            cardLayout.show(cardPanel, "Submitted Page");
        } else if (event.getSource() == subButton && !(jb.isSelected())) {
            JOptionPane.showMessageDialog(frame, "Please Accept terms and conditions");

        } else if (event.getSource() == canButton) {
            CancelData();
            cardLayout.show(cardPanel, "Home Page");

        }
    }

    public void CancelData() {

        IDField.setText(null);
        fnameField.setText(null);
        lnameField.setText(null);
        areaField.setText(null);

        provinceField.setSelectedIndex(-1);
        genMale.setSelected(false);
        genFemale.setSelected(false);
        hobCricket.setSelected(false);
        hobFootball.setSelected(false);
        hobReading.setSelected(false);
        hobAnyOther.setSelected(false);
        jb.setSelected(false);

    }

    public String Summary() {

        SID = IDField.getText();
        SFName = fnameField.getText();
        SLName = lnameField.getText();
        SProvince = (String) provinceField.getSelectedItem();
        SAddress = areaField.getText();

        if (genMale.isSelected()) {
            SGender = "Male";
        } else if (genFemale.isSelected()) {
            SGender = "Female";
        }

        SHobbies = null;
        if (hobCricket.isSelected()) {
            SHobbies = "Cricket";
        }
        if (hobFootball.isSelected()) {
            SHobbies += " Football";
        }
        if (hobReading.isSelected()) {
            SHobbies += "   Reading";
        }
        if (hobAnyOther.isSelected()) {
            SHobbies += "   Any Other";
        }

        String summary = "";
        summary += "User ID: " + SID + "\nFirst Name:    " + SFName + "\nLast Name:    " + SLName + "\nGender:   "
                + SGender + "\nProvince:   " + SProvince + "\nHobbies: " + SHobbies + "\nAddress: " + SAddress;

        JOptionPane.showMessageDialog(frame, summary);

        return summary;
    }

}

public class BForm {

    public static void main(String args[]) {

        D d = new D();

    }

}
