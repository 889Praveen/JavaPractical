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
}
public class HelloWorld {
    public static void main(String[] args) {
        int choice;
        Number obj=new Number(58);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one for isEven..");
       System.out.println("Enter Number of choice:");
       choice=sc.nextInt();
       switch(choice)
       {
           
       case 1:
      
             System.out.println("Number is:"+obj.isEven());
       
       }
}
}