
public class pro1
{
 public static void main(String args[])
  {
    int i;
    int j,temp;
    int[] num=new int[5];
    try{
    for(i=0;i<args.length;i++)
    {
       num[i]=Integer.parseInt(args[i]);
    }
  
    {
        System.out.println("not");
    }
    for(i=0;i<5;i++)
    {
        System.out.println("array1:"+num[i]);
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
    for(i=0;i<args.length;i++)
    {
        System.out.println("Array2:"+num[i]);
    }
    System.out.println("l:"+num[0]);
    System.out.println("h:"+num[4]);
    }
     catch (NumberFormatException e) {
            System.out.println("Invalid input.Please enter integers only...!");
        }
  }
}
