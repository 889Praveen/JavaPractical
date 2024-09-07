interface shape
{
 
  public double area();
  public double perimeter();
}
class Triangle implements shape
{
  double a,b,c;
  double l;
  double h;
    
   Triangle(double a,double b,double c,double l,double h)
   {
     this.a=a;

     this.b=b;
     this.c=c;
     this.l=l;
    this.h=h; 
   }
   public double area()
   {
     double temp;
     temp=(this.l*this.h)/2;
     return temp;
   }
   public double perimeter()
   {
     double temp;
     temp=this.a+this.b+this.c;
     return temp;
   }
}
class Rectangle implements shape
{
 double r;
  double y;
  Rectangle()
  {

  }
 Rectangle(double width,double height)
  {
      r=width;
      y=height;
  }
  public double area()
  {
    double temp;
    temp=r*y;
    return temp;
  }
  public double perimeter()
  {
    double temp;
    temp=2*(r+y);
    return temp;
  } 
}
class Circle implements shape
{
  double r;
   Circle()
   {

   }
    Circle(double a)
    {
       r=a;
    }
   public double area()
   {
     double temp;
     double pi=3.14;

     temp=pi*r*r;
     return temp;
   }
   public double perimeter()
   {
     double temp;
     double pi=3.14;
     temp=2*pi*r;
     return temp;
   }
    
}
public class pro10
{
    public static void main(String args[])
    {
     
        Rectangle  rectangle = new Rectangle(5,10);
        Triangle triangle = new Triangle(6,8,4,7,3);
        Circle circle = new Circle(7);
        
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
    }
}