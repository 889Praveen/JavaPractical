
public class pro1
{
 public static void main(String args[])
  {
    int i;
    int j,temp,max;
    int[] num=new int[args.length];
    try{
    for(i=0;i<args.length;i++)
    {
       num[i]=Integer.parseInt(args[i]);
    }
    for(i=0;i<args.length;i++)
    {
        System.out.println(num[i]);
    }
  
   for(i=0;i<args.length;i++)
   {
    for(j=i+1;j<args.length;j++)
    {
        if(num[i]>num[j])
        {
          temp=num[i];
          num[i]=num[j];
          num[j]=temp;
        }
    }
   }
   System.out.println("Sort");
    for(i=0;i<args.length;i++)
    {
        System.out.println(num[i]);
    }
   

     max=num[0];
     for(i=0; i<args.length; i++)
     {
       if(max<num[i])
       {
          max=num[i];
       }

     }


    System.out.println("Min:"+num[0]);
    System.out.print("Max:"+max); 
    }
     catch (NumberFormatException e) {
            System.out.println("Invalid inpute Enter integers only...!");
        }
  }
}