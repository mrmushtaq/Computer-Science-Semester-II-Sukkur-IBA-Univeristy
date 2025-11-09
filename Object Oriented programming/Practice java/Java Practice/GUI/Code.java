
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code extends JFrame implements ActionListener {

    private JRadioButton option1, option2;
    private JCheckBox checkBox;
    private JComboBox<String> comboBox;
    private JTextField textField;
    private JButton generateButton;

    public Code() {
        setTitle("Input Summary");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1));

        option1 = new JRadioButton("Option 1");
        option2 = new JRadioButton("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        checkBox = new JCheckBox("Check Box");

        String[] options = {"Option A", "Option B", "Option C"};
        comboBox = new JComboBox<>(options);

        textField = new JTextField(10);

        generateButton = new JButton("Generate Summary");
        generateButton.addActionListener(this);

        add(option1);
        add(option2);
        add(checkBox);
        add(comboBox);
        add(textField);
        add(generateButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            StringBuilder summary = new StringBuilder();
            if (option1.isSelected()) {
                summary.append("Option 1 selected.\n");
            }
            if (option2.isSelected()) {
                summary.append("Option 2 selected.\n");
            }
            if (checkBox.isSelected()) {
                summary.append("Check Box checked.\n");
            }
            summary.append("Combo Box selection: ").append(comboBox.getSelectedItem()).append("\n");
            summary.append("Text Field input: ").append(textField.getText()).append("\n");

            JOptionPane.showMessageDialog(this, summary.toString(), "Summary", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Code::new);
    }
}
