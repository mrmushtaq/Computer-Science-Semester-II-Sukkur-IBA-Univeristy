import java.awt.*;
import javax.swing.*;

class Data {
    JFrame myFrame;
    Container c;
    JLabel topic, ID, name, province, gender, hobbies, sugg;
    JButton subButton;
    JTextField IDField, nameField;
    JComboBox areaProvince;
    JRadioButton genMale, genFemale, genOther;
    JCheckBox hobCricket, hobFootball, hobReading, hobWriting, hobAnyOther;


    void initialData() {
        myFrame = new JFrame();
        c = myFrame.getContentPane();

        c.setLayout(new GridLayout(9, 2, 5, 5));

        topic = new JLabel("My Bio Form ");
	topic.setHorizontalAlignment(SwingConstants.RIGHT);
        ID = new JLabel("User ID ");
        name = new JLabel("Name ");
        province = new JLabel("Province ");
        hobbies = new JLabel("Hobbies");
        gender = new JLabel("Gender");
        sugg = new JLabel("Suggestion ");
        subButton = new JButton("Submit");

        IDField = new JTextField(15);
        nameField = new JTextField(15);

        String p[] = {"Sindh", "Punjab", "Balochistan", "KPK"};
        areaProvince = new JComboBox <> (p);

        genMale = new JRadioButton("Male");
        genFemale = new JRadioButton("Female");
        genOther = new JRadioButton("Any Other");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(genMale);
        genderGroup.add(genFemale);
        genderGroup.add(genOther);

        hobCricket = new JCheckBox("Cricket");
        hobFootball = new JCheckBox("Football");
        hobReading = new JCheckBox("Reading");
        hobWriting = new JCheckBox("Writing");
        hobAnyOther = new JCheckBox("Any Other");

        c.add(topic);
        c.add(new JLabel()); // Empty label for spacing

        c.add(ID);
        c.add(IDField);

        c.add(name);
        c.add(nameField);

        c.add(province);
        c.add(areaProvince);

        c.add(gender);
        JPanel genderPanel = new JPanel(new FlowLayout()); 
        genderPanel.add(genMale);
        genderPanel.add(genFemale);
        genderPanel.add(genOther);
        c.add(genderPanel);

        c.add(hobbies);
        JPanel hobbiesPanel = new JPanel(new FlowLayout());
        hobbiesPanel.add(hobCricket);
        hobbiesPanel.add(hobFootball);
        hobbiesPanel.add(hobReading);
        hobbiesPanel.add(hobWriting);
        hobbiesPanel.add(hobAnyOther);
        c.add(hobbiesPanel);

        c.add(sugg);
        c.add(subButton);

        myFrame.setSize(300, 400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

public class BioData2 {
    public static void main(String args[]) {
        Data d = new Data();
        d.initialData();
    }
}
