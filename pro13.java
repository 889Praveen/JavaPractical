class oddthread extends Thread
{
    int i;
   public void run() 
    {
      for(i=1;i<=100;i++)
      { 
        if(i%2!=0)
        {
         //Thread.sleep(500);
         System.out.println("odd:"+i);
         try{
         Thread.sleep(500);
         }
         catch(InterruptedException e)
         {

         }
        }
      }
    }
}
class primeThread implements Runnable 
{
  int j;
  public void run() 
    {
     for(j=0;j<=100;j++)
     {
      if(j%2==0)
      {
        System.out.println("even:"+j);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }   
     }
    }
      
}
public class pro13  
{

 public static void main(String[] args) {
    Thread bo=new Thread(new oddthread());
    Thread obj=new Thread(new primeThread());
    obj.start();
    bo.start();
 }
}