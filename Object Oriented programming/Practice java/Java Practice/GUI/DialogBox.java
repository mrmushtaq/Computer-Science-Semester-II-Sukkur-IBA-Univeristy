
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class D implements ActionListener {

    JFrame f = new JFrame();
    Container c;
    JButton b = new JButton();
    JTextField t = new JTextField();

    D() {
        c = f.getContentPane();

        b = new JButton();
        b.setText("I am Button");
        b.addActionListener(this); // Registering ActionListener
        c.add(b);

        t = new JTextField(15);

        c.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            // Show dialog box
            JOptionPane.showMessageDialog(f, "Button Clicked!");
        }
    }

}

public class DialogBox {

    public static void main(String args[]) {
        D d = new D();
    }

}
