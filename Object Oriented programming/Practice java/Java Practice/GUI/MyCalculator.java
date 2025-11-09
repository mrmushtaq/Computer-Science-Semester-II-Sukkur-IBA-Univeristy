import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCalculator implements ActionListener {

    JFrame frame;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b00, bPercent, bBack;
    JButton bPlus, bMinus, bMul, bDiv, bPoint, bEqual, bClear;
    JPanel pButtons;
    JTextField Answer;
    JLabel MyCalc;

    void initGUI() {
        frame = new JFrame();
        b0 = new JButton("0");
        b0.setPreferredSize(new Dimension(60, 60));
        b0.setFont(new Font("Arial", Font.BOLD, 20));
        b0.addActionListener(this);

        b00 = new JButton("00");
        b00.setPreferredSize(new Dimension(60, 60));
        b00.setFont(new Font("Arial", Font.BOLD, 20));
        b00.addActionListener(this);

        b1 = new JButton("1");
        b1.setPreferredSize(new Dimension(60, 60));
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setPreferredSize(new Dimension(60, 60));
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setPreferredSize(new Dimension(60, 60));
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.setPreferredSize(new Dimension(60, 60));
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.setPreferredSize(new Dimension(60, 60));
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.setPreferredSize(new Dimension(60, 60));
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.setPreferredSize(new Dimension(60, 60));
        b7.setFont(new Font("Arial", Font.BOLD, 20));
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.setPreferredSize(new Dimension(60, 60));
        b8.setFont(new Font("Arial", Font.BOLD, 20));
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.setPreferredSize(new Dimension(60, 60));
        b9.setFont(new Font("Arial", Font.BOLD, 20));
        b9.addActionListener(this);

        bPlus = new JButton("+");
        bPlus.setPreferredSize(new Dimension(60, 60));
        bPlus.setFont(new Font("Arial", Font.BOLD, 20));
        bPlus.addActionListener(this);

        bMinus = new JButton("-");
        bMinus.setPreferredSize(new Dimension(60, 60));
        bMinus.setFont(new Font("Arial", Font.BOLD, 20));
        bMinus.addActionListener(this);

        bMul = new JButton("*");
        bMul.setPreferredSize(new Dimension(60, 60));
        bMul.setFont(new Font("Arial", Font.BOLD, 20));
        bMul.addActionListener(this);

        bDiv = new JButton("/");
        bDiv.setPreferredSize(new Dimension(60, 60));
        bDiv.setFont(new Font("Arial", Font.BOLD, 20));
        bDiv.addActionListener(this);

        bPoint = new JButton(".");
        bPoint.setPreferredSize(new Dimension(60, 60));
        bPoint.setFont(new Font("Arial", Font.BOLD, 20));
        bPoint.addActionListener(this);

        bEqual = new JButton("=");
        bEqual.setPreferredSize(new Dimension(60, 60));
        bEqual.setFont(new Font("Arial", Font.BOLD, 20));
        bEqual.addActionListener(this);

        bClear = new JButton("C");
        bClear.setPreferredSize(new Dimension(60, 60));
        bClear.setFont(new Font("Arial", Font.BOLD, 20));
        bClear.addActionListener(this);

        bPercent = new JButton("%");
        bPercent.setPreferredSize(new Dimension(60, 60));
        bPercent.setFont(new Font("Arial", Font.BOLD, 20));
        bPercent.addActionListener(this);

        bBack = new JButton("\u2190");
        bBack.setPreferredSize(new Dimension(60, 60));
        bBack.setFont(new Font("Arial", Font.BOLD, 20));
        bBack.addActionListener(this);

        Answer = new JTextField(14);
        Answer.setPreferredSize(new Dimension(60, 60));
        Answer.setFont(new Font("Arial", Font.BOLD, 20));
        MyCalc = new JLabel("My Clacualator");

        pButtons = new JPanel(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;

        JPanel MPanel = new JPanel(new GridBagLayout());
        MPanel.add(Answer, g);
        g.gridy++;
        MPanel.add(pButtons, g);
        g.gridy++;
        g.gridx = 0;
	pButtons.add(bClear, g);
        g.gridx = 1;
	pButtons.add(bBack, g);
        g.gridx = 2;
        pButtons.add(bPercent, g);
        g.gridx = 3;
        pButtons.add(bDiv, g);
        g.gridy++;
        g.gridx = 0;
        pButtons.add(b7, g);
        g.gridx = 1;
        pButtons.add(b8, g);
        g.gridx = 2;
        pButtons.add(b9, g);
        g.gridx = 3;
        pButtons.add(bMul, g);
        g.gridy++;
        g.gridx = 0;
        pButtons.add(b4, g);
        g.gridx = 1;
        pButtons.add(b5, g);
        g.gridx = 2;
        pButtons.add(b6, g);
        g.gridx = 3;
        pButtons.add(bMinus, g);
        g.gridx = 0;
        g.gridy++;
        pButtons.add(b1, g);
        g.gridx = 1;
        pButtons.add(b2, g);
        g.gridx = 2;
        pButtons.add(b3, g);
        g.gridx = 3;
        pButtons.add(bPlus, g);
        g.gridx = 0;
        g.gridy++;
        pButtons.add(b0, g);
        g.gridx = 1;
        pButtons.add(b00, g);
        g.gridx = 2;
	pButtons.add(bPoint, g);
        g.gridx = 3;
        pButtons.add(bEqual, g);

        Container con = frame.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(new JLabel(" "), BorderLayout.NORTH);
        con.add(MyCalc, BorderLayout.SOUTH);
        con.add(MPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        JButton button = (JButton) event.getSource();
        String buttonText = button.getText();

        if (event.getSource() == b0 || event.getSource() == b00 || event.getSource() == b1 || event.getSource() == b2
                || event.getSource() == b3 || event.getSource() == b4 || event.getSource() == b5 || event.getSource() == b6
                || event.getSource() == b7 || event.getSource() == b8 || event.getSource() == b9 || event.getSource() == bMul
                || event.getSource() == bMinus || event.getSource() == bPlus || event.getSource() == bDiv
                || event.getSource() == bPoint || event.getSource() == bPercent) {

            Answer.setText(Answer.getText() + button.getText());

        } else if (event.getSource() == bEqual) {
            String temp = Answer.getText();
            int l = temp.length();
            String[] s = new String[15];
            char[] c = new char[15];

            if (temp.startsWith("*") || temp.endsWith("*") || temp.endsWith("+") || temp.endsWith("-")
                    || temp.endsWith("/") || temp.endsWith("%")) {
                Answer.setText("Math Error");
            } else {
                int startIndex = 0;
                int numIndex = 0;

                for (int i = 0; i < l; i++) {
                    char currentChar = temp.charAt(i);

                    if (currentChar == '*' || currentChar == '+' || currentChar == '-' || currentChar == '/'
                            || currentChar == '%') {

                        if (i < l - 1 && (temp.charAt(i + 1) == '*' || temp.charAt(i + 1) == '+'
                                || temp.charAt(i + 1) == '-' || temp.charAt(i + 1) == '/' || temp.charAt(i + 1) == '%')) {
                            Answer.setText("Math Error");
                            break;
                        } else {

                            s[numIndex] = temp.substring(startIndex, i).trim();
                            c[numIndex] = currentChar;
                            startIndex = i + 1;
                            numIndex++;
                        }
                    }
                }

                s[numIndex] = temp.substring(startIndex).trim();

                double result = Double.parseDouble(s[0]);
                for (int i = 0; i < numIndex; i++) {
                    double num2 = Double.parseDouble(s[i + 1]);
                    switch (c[i]) {
                        case '+':
                            result += num2;
                            break;
                        case '-':
                            result -= num2;
                            break;
                        case '*':
                            result *= num2;
                            break;
                        case '/':
                            if (num2 == 0) {
                                Answer.setText("Math Error");
                                return;
                            }
                            result /= num2;
                            break;
                        case '%':
                            result %= num2;
                            break;
                    }
                }
                Answer.setText(String.valueOf(result));
            }
        } else if (event.getSource() == bClear) {
            Answer.setText("");
        } else if (event.getSource() == bBack) {
            String currentText = Answer.getText();
            if (!currentText.isEmpty()) {
                Answer.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    }

    public MyCalculator() {
        initGUI();
    }

    public static void main(String args[]) {
        MyCalculator calGUI = new MyCalculator();
    }
}
