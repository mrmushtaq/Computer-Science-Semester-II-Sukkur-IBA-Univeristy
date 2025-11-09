	//Step1: 

import java.awt.*; 
import javax.swing.*;
 
class guiTest
{ 
	JFrame myFrame; 
	// Step 2 
	JTextField myTextField; 
	JButton myButton1; 

	void initGUI()
	{ 
 		myFrame = new JFrame();
	//Step3: 
 		Container c = myFrame.getContentPane(); 
	//Step4: 
 		c.setLayout(new FlowLayout()); 
	//Setp5: 
 		JTextField myTextField = new JTextField(10); 
 		JButton myButton1 = new JButton("Hello"); 
 		c.add(myTextField); 
 		c.add(myButton1); 
	//Step6: 
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		myFrame.setSize(200,150); 
		myFrame.setVisible(true); 
	} 
}

public class GUI
{ 
	public static void main(String[] args)
	{ 
 		guiTest gt = new guiTest(); 
 		gt.initGUI(); 
	} 
} 
