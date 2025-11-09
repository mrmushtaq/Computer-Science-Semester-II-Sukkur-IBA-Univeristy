import java.awt.*;
import javax.swing.*;

class GUI
{
	JFrame JF;
	JTextField JT;
	JButton JB;

	void intGUI()
	{
		JF=new JFrame();
		Container c = JF.getContentPane();
		c.setLayout(new FlowLayout());

		JTextField JT= new JTextField(10);
		JButton JB = new JButton("Submit");

		JLabel name =new JLabel("Wow I am Done ");
			

		c.add(JT);
		c.add(JB);
		c.add(name);

		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF.setSize(200,300);
		JF.setVisible(true);
	
	} 
}


public class MyGUI
{
	public static void main(String args[])
	{
		GUI g=new GUI();
		g.intGUI();
	}
}