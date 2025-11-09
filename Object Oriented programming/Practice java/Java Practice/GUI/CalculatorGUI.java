// File CalculatorGUI.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorGUI implements ActionListener {

    JFrame fCalc;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    JButton bPlus, bMinus, bMul, bPoint, bEqual, bClear;
    JPanel pButtons;
    JTextField tfAnswer;
    JLabel lMyCalc;
//method used for setting layout of GUI public 

    void initGUI() {
        fCalc = new JFrame();
        b0 = new JButton("0");
        b0.addActionListener(this);
        b1 = new JButton("1");
        b1.addActionListener(this);
        b2 = new JButton("2");
        b2.addActionListener(this);
        b3 = new JButton("3");
        b3.addActionListener(this);
        b4 = new JButton("4");
        b4.addActionListener(this);
        b5 = new JButton("5");
        b5.addActionListener(this);
        b6 = new JButton("6");
        b6.addActionListener(this);
        b7 = new JButton("7");
        b7.addActionListener(this);
        b8 = new JButton("8");
        b8.addActionListener(this);
        b9 = new JButton("9");
        b9.addActionListener(this);
        bPlus = new JButton("+");
        bPlus.addActionListener(this);
        bMinus = new JButton("-");
        bMinus.addActionListener(this);
        bMul = new JButton("*");
        bMul.addActionListener(this);
        bPoint = new JButton(".");
        bPoint.addActionListener(this);
        bEqual = new JButton("=");
        bEqual.addActionListener(this);
        bClear = new JButton("C");
        bClear.addActionListener(this);

        tfAnswer = new JTextField();
        lMyCalc = new JLabel("My Clacualator");
//creating panel object and setting its layout 
        pButtons = new JPanel(new GridLayout(4, 4));
//adding components (buttons) to panel 
        pButtons.add(b1);
        pButtons.add(b2);
        pButtons.add(b3);
        pButtons.add(bClear);
        pButtons.add(b4);
        pButtons.add(b5);
        pButtons.add(b6);
        pButtons.add(bMul);
        pButtons.add(b7);
        pButtons.add(b8);
        pButtons.add(b9);
        pButtons.add(bMinus);
        pButtons.add(b0);
        pButtons.add(bPoint);
        pButtons.add(bPlus);
        pButtons.add(bEqual);
// getting componenet area of JFrame 
        Container con = fCalc.getContentPane();
        con.setLayout(new BorderLayout());
//adding components to container 
        con.add(tfAnswer, BorderLayout.NORTH);
        con.add(lMyCalc, BorderLayout.SOUTH);
        con.add(pButtons, BorderLayout.CENTER);
        fCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fCalc.setSize(300, 300);
        fCalc.setVisible(true);
    } // end of GUI Method 

    public void actionPerformed(ActionEvent event) {

        JButton button = (JButton) event.getSource();
        String buttonText = button.getText();

        if (event.getSource() == b0
                || event.getSource() == b1
                || event.getSource() == b2
                || event.getSource() == b3
                || event.getSource() == b4
                || event.getSource() == b5
                || event.getSource() == b6
                || event.getSource() == b7
                || event.getSource() == b8
                || event.getSource() == b9
                || event.getSource() == bMul
                || event.getSource() == bMinus
                || event.getSource() == bPlus
                || event.getSource() == bPoint) {

            tfAnswer.setText(tfAnswer.getText() + button.getText());

        } else if (event.getSource() == bEqual) {
            String temp = tfAnswer.getText();
            int l = temp.length();
            String[] s = new String[15];
            char[] c = new char[15];

            // Check for math errors in the input expression
            if (temp.startsWith("*") || temp.endsWith("*") || temp.endsWith("+") || temp.endsWith("-")) {
                tfAnswer.setText("Math Error");
            } else {
                int startIndex = 0;
                int numIndex = 0;

                for (int i = 0; i < l; i++) {
                    char currentChar = temp.charAt(i);

                    if (currentChar == '*' || currentChar == '+' || currentChar == '-') {

                        if (i < l - 1 && (temp.charAt(i + 1) == '*' || temp.charAt(i + 1) == '+' || temp.charAt(i + 1) == '-')) {
                            tfAnswer.setText("Math Error");
                            break;
                        } else {

                            s[numIndex] = temp.substring(startIndex, i).trim();
                            c[numIndex] = currentChar;
                            startIndex = i + 1;
                            numIndex++;
                        }
                    }
                }

                // Extract the last number
                s[numIndex] = temp.substring(startIndex).trim();

                // Perform the calculation
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
                    }
                }
                tfAnswer.setText(String.valueOf(result));
            }
        } else if (event.getSource() == bClear) {

            tfAnswer.setText("");
        }
    }

    public CalculatorGUI() { // default constructor 
        initGUI();
    }

    public static void main(String args[]) {
        CalculatorGUI calGUI = new CalculatorGUI();
    }
} // end of class
