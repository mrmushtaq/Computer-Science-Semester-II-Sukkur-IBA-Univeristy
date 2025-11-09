import javax.swing.*;
import java.awt.*;

class C
{
    JFrame f= new JFrame("My Template");
        Container c = f.getContentPane();
    C()
    {
        c.setBackground(Color.GRAY);
        c.setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

    //    p1.setBackground(Color.BLACK);
      //  p1.setBounds(0,0,250,250);

        p2.setBackground(Color.GREEN);
        p2.setBounds(50,50,250,250);

        p3.setBackground(Color.YELLOW);
        p3.setBounds(0,80,250,250);

        p4.setBackground(Color.PINK);
        p4.setBounds(50,50,250,250);

        p5.setBackground(Color.BLUE);
        p5.setBounds(100,100,250,250);
       
 //   
  //      c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.WEST);
        c.add(p3, BorderLayout.EAST);
        c.add(p4, BorderLayout.CENTER);
        c.add(p5, BorderLayout.SOUTH);
       
        p1.setVisible(true);
        p2.setVisible(true);
        p3.setVisible(true);
        p4.setVisible(true);
        p5.setVisible(true);

        f.setVisible(true);
        f.setSize(900,600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class Template
{
    public static void main (String args[])
    {
        C c = new C();
    }
}