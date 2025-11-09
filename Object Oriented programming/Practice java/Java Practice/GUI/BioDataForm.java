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

    JPanel pButtons;

    void initialData() {
        myFrame = new JFrame();
        c = myFrame.getContentPane();

        c.setLayout(new BorderLayout());

        topic = new JLabel("My Bio Form ");
        ID = new JLabel("User ID ");
        name = new JLabel("Name ");
        province = new JLabel("Province ");
        hobbies = new JLabel("Hobbies");
        gender = new JLabel("Gender");
        sugg = new JLabel("Suggestion ");
        subButton = new JButton("Submit");

        IDField = new JTextField(15);
        nameField = new JTextField(15);

        String[] p = {"Sindh", "Punjab", "Balochistan", "KPK"};
        areaProvince = new JComboBox<>(p);

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

        pButtons = new JPanel(new FlowLayout());
        pButtons.add(ID);
        pButtons.add(IDField);
        pButtons.add(name);
        pButtons.add(nameField);
        pButtons.add(province);
        pButtons.add(areaProvince);
        pButtons.add(gender);
        pButtons.add(genMale);
        pButtons.add(genFemale);
	pButtons.add(genOther);
        pButtons.add(hobbies);
        pButtons.add(hobCricket);
        pButtons.add(hobFootball);
        pButtons.add(hobReading);
        pButtons.add(hobWriting);
        pButtons.add(hobAnyOther);
        pButtons.add(sugg);
        pButtons.add(subButton);

        c.add(topic, BorderLayout.NORTH);
        c.add(pButtons, BorderLayout.CENTER);


        myFrame.setSize(250, 300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

public class BioDataForm {
    public static void main(String args[]) {
        Data d = new Data();
        d.initialData();
    }
}
