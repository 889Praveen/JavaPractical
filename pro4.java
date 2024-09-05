
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*Create class Number with only one private instance variable as a double
primitive type. To include the following methods (include respective
constructors) isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ), the above
methods return boolean type and getFactorial(), the above method returns
double type. */

import java.util.*;
class Number {
    private double inse;
    Number(double inse)
    {
     this.inse=inse;  
    }
    public Boolean isEven()
    {
       if(inse%2==0) 
       {
           return true;
       }
       return false;
    }
    public Boolean isodd()
    {
       if(inse%2==0) 
       {
           return false;
       }
       return true;
    }
    public Boolean iszero()
    {
        if(inse==0)
        {
            return true;
        }
        return false;
    }
    public Boolean isNegative()
    {
        if(inse<0)
        {
            return true;
        }
        return false;
    }
    public Boolean isPositive()
    {
        if(inse>0)
        {
            return true;
        }
        return false;
    }
  public double getFactorial() {
        long fact = 1;
        
        for (int i = 1; i <=inse;i++) {
            fact = fact * i;
        }
   
        return fact;
        
    }
}
public class pro4{
    public static void main(String args[]) {
        int choice;
        Number obj=new Number(5);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter One for isEven..");
        System.out.println("Enter Two for isodd..");
        System.out.println("Enter Three for iszero..");
        System.out.println("Enter four for isPositive..");
        System.out.println("Enter five for isNegative..");
        System.out.println("Enter six for getFactorial..");
        System.out.println("Enter Number of choice:");
       choice=sc.nextInt();
       switch(choice)
       {
           
       case 1:
             System.out.println("Number is:"+obj.isEven());
       case 2:
             System.out.println("Number is:"+obj.isodd()); 
       case 3:
             System.out.println("Number is:"+obj.iszero()); 
       case 4:
              System.out.println("Number is:"+obj.isPositive()); 
       case 5:
              System.out.println("Number is:"+obj.isNegative());  
       case 6:
              System.out.println("Factorial is:"+obj. getFactorial());
       }
}
}
