class Cylinder
{
    double v,r,h;

    Cylinder()
    {
        r=1;
        h=1;
    }

    Cylinder(double r, double h)
    {
        this.r=r;
        this.h=h;
    }


    void VolumeOfCylinder(double r, double h)
    {
        v=(22*this.r*this.r*this.h)/7;
    }

    void VolumeOfCylinder()
    {
        v=(22*r*r*h)/7;
    }


    Cylinder SetValues(Cylinder c)
    {
        c.r=r;  
        c.h=h;

        return c;
    }

    void display()
    {
        System.out.println("Volume of Cylinder is " + v);
    }
}

public class NewPractice2 {
    public static void main (String args[])
    { 
        Cylinder c=new Cylinder(); // r=1, h=1
        Cylinder c1=new Cylinder(5,8); // r=5, h=5


      c.VolumeOfCylinder();
        c.display(); // 1,1


        c1.VolumeOfCylinder();
        c1.display(); //5,8

        
      Cylinder c2=  c1.SetValues(c1);
        c2.display(); // 5,8

        Cylinder c3=  c1.SetValues(c);
        c3.display();// 1,1

    
        Cylinder c4=  c2.SetValues(c);
        c3.display();// 1,1

    }
    
}
