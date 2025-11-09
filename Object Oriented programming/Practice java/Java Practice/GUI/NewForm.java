
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.ActionMapUIResource;

class Details implements ActionListener {

    JFrame frame = new JFrame("My First Assignment");
    Container c = frame.getContentPane();

    JLabel topic, ID, name, gender, province, hobbies, address;
    JTextField IDField, nameField, areaField;
    JComboBox provinceField;
    JRadioButton genMale, genFemale;
    JCheckBox hobCricket, hobFootball, hobReading, hobAnyOther;
    JButton subButton, canButton, preButton;

    CardLayout cardLayout = new CardLayout();
    JPanel panel = new JPanel();

    Details() {

        c.setLayout(new BorderLayout());

        panel.setLayout(cardLayout);

        panel.add(HomePage(), "Page 1");
        panel.add(RegistrationPage(), "Page 1");

        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    private JPanel HomePage() {
        JPanel homePanel = new JPanel();

        JButton b = new JButton("Registration Form");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Page 2");
            }

            homePanel.add (

            new JLabel("Page 1"));
            homePanel.add (b);
            return homePanel ;
        });
    }

    private JPanel RegistrationPage() {

        topic = new JLabel("My Bio Form");
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

        province = new JLabel("Province");
        province.setForeground(Color.WHITE);
        province.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(province, gbc);

        String p[] = {"Sindh", "Punjab", "KPK", "Balochistan"};
        provinceField = new JComboBox<>(p);
        provinceField.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(provinceField, gbc);

        gender = new JLabel("Gender");
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.LINE_START;
        formPanel.add(gender, gbc);

        genMale = new JRadioButton("Male");
        genMale.setFont(new Font("Arial", Font.PLAIN, 20));
        genFemale = new JRadioButton("Female");
        genFemale.setFont(new Font("Arial", Font.PLAIN, 20));

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(genMale);
        genderGroup.add(genFemale);

        JPanel genPanel = new JPanel();
        genPanel.add(genMale);
        genPanel.add(genFemale);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(genPanel, gbc);

        hobbies = new JLabel("Hobbies");
        hobbies.setFont(new Font("Arial", Font.PLAIN, 20));
        hobbies.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.LINE_START;
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
        hobPanel.add(hobCricket);
        hobPanel.add(hobFootball);
        hobPanel.add(hobReading);
        hobPanel.add(hobAnyOther);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
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
        subPanel.add(new JLabel("       "));  // space between Preview and submit Button
        subPanel.add(subButton);
        subPanel.add(new JLabel("       "));  // space between submit and cancel Button
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

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == preButton) {
            String summary = "User ID   " + IDField.getText()
                    + "\nName " + nameField.getText()
                    + "\nProvince   " + provinceField.getSelectedItem();
            if (genMale.isSelected()) {
                summary += "\nGender    Male";
            }
            if (genFemale.isSelected()) {
                summary += "\nGender    Female";
            }

            if (hobCricket.isSelected()) {
                summary += "\nHobbies    Cricket    ";
            }
            if (hobFootball.isSelected()) {
                summary += "Football    ";
            }
            if (hobReading.isSelected()) {
                summary += "Reading ";
            }
            if (hobAnyOther.isSelected()) {
                summary += "Any Other   ";
            }

            summary += "\nAddress    " + areaField.getText();

            JOptionPane.showMessageDialog(frame, summary);

        }
        if (event.getSource() == subButton) {
            JOptionPane.showMessageDialog(frame, "Submitted Successfully ! ");
        } else if (event.getSource() == canButton) {

            IDField.setText("");
            nameField.setText("");
            areaField.setText("");

            provinceField.setSelectedIndex(-1);
            genMale.setSelected(false);
            genFemale.setSelected(false);
            hobCricket.setSelected(false);
            hobFootball.setSelected(false);
            hobReading.setSelected(false);
            hobAnyOther.setSelected(false);
            JOptionPane.showMessageDialog(frame, "Submission Cancelled !");

        }
    }

    public static void main(String args[]) {
        Details d = new Details();
    }
}
