
import java.util.*;
class circle {
    private double x, y, r;
    double pi = 3.14;

    circle()
	{
        this.x = 1;
        this.y = 1;
        this.r = 1;
    }

    circle(double r)
	{
        this.x = 1;
        this.y = 1;
        this.r = r;
    }

    circle(double x, double y, double r)
	{
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double area() 
	{
        double temp;
		temp = pi * this.r * this.r;
		return temp;
    }

    public double circumference()
	{ 
	    double temp;		
        temp = 2 * pi * this.r;
		return temp;
    }

    public double diameter()
	{
	    double temp;
		
         temp = 2 * this.r;
		 return temp;
    }

    void display() 
	{
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("r:" + r);
    }
}

public class pro6 
{
    public static void main(String[] args) 
	{
        // System.out.println(c.area());
        // System.out.println(c.circumference());
        // System.out.println(c.diameter())
        Scanner obj = new Scanner(System.in);
        while (true) 
		{
            System.out.println("Enter One For default..");
            System.out.println("Enetr Two For Only Radias..");
            System.out.println("Enter Three For x,y and r..");
            System.out.println("Enter Four For Display..");
            System.out.println("Enetr your choice");
            int choice;
            choice = obj.nextInt();

            switch (choice)
			{
                case 1:
                    circle c = new circle();
                    c.display();
                    System.out.println("Area Of circle is:" + c.area());
                    System.out.println("perimeter of a circle is:" + c.circumference());
                    System.out.println("diameter of a circle: is:" + c.diameter());
                    break;
                case 2:
                    System.out.println("Enter radius of circle:");
                    double r = obj.nextDouble();
                    circle c1 = new circle(r);
                    c1.display();
                    System.out.println("Area Of circle is:" + c1.area());
                    System.out.println("perimeter of a circle is:" + c1.circumference());
                    System.out.println("diameter of a circle: is:" + c1.diameter());
                    break;
                case 3:
                    System.out.println("Enter x,y and radius of circle:");
                    double x = obj.nextDouble();
                    double y = obj.nextDouble();
                    double r1 = obj.nextDouble();
                    circle c2 = new circle(x,y,r1);
                    c2.display();
                    System.out.println("Area Of circle is:" + c2.area());
                    System.out.println("perimeter of a circle is:" + c2.circumference());
                    System.out.println("diameter of a circle: is:" + c2.diameter());
                    break; 
           
                default:
                    break;
            }

        }
    }
}
