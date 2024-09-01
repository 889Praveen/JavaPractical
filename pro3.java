import java.util.*;
class utility{
public static long factorial(int n)
{
  long temp=1;
  int i;
  for(i=2;i<=n;i++)
  {
    temp*=i;
  }
  return temp;
}
 public static boolean isprime(int n)
 {
  int f=0,i,temp;
  
  for(i=2;i<n;i++)
   {
     if(n%i==0)
     {
          return false;
     }
   
   }  
   return true;
  }
}
public class pro3
{
public static void main(String args[]) 
{
    int temp;
    boolean n;
   // utility obj=new utility();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number for Factorial:");
    temp=sc.nextInt();
    System.out.println("");
    System.out.println("Factorial is:"+utility.factorial(temp));
    
    //utility.prime();
    if(utility.isprime(4)!=false)
    {
      System.out.println("Number is Prime:");
    }
    else
    {
      System.out.println("Number is Not prime:");
    }
}  
}