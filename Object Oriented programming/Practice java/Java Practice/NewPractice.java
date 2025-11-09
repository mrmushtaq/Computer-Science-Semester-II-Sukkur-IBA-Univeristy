class Shape
{
    int number;
    String name;

    Shape()
    {
        System.out.println("Shape constructor without parameter");
        number=1;
        name="round";
    }

    Shape(int number, String name)
    {
        System.out.println("Shape constructor with parameter");
        this.number=number;
        this.name=name;
    }

    void display()
    {
        System.out.println("Number of Shape is " + number);
        System.out.println("Name of shape is " + name);
    
    }
}


class Circle extends Shape
{
    double radius, area;
    String name;

    Circle()
    {
        super(3,"Round");
        
        System.out.println("Circle without Parameter ");
        radius=10;
    }

    Circle(int radius)
    {
        
        System.out.println("Circle with Parameter ");
        this.radius=radius;
    }

    double AreaOfCircle()
    {
        
        area=(22*radius*radius)/7;
        return area;
    }

    void display()
    {
        super.name="Triangle";
        this.name="Rectangle";
        super.display();
        System.out.println("Area of Circle is " + area);
        System.out.println(name + " in Circle class");
    }
}

public class NewPractice {
    public static void main (String args[])
    { 
        Circle c=new Circle();
        c.AreaOfCircle();
        c.display();
        

    }
    
}
