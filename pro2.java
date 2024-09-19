import java.util.*;
public class pro2
{
    public static void main(String args[])
    {
        int i;
        String[] str=new String[5];
       
        for(i=0;i<args.length;i++)
        {
            str[i]=args[i];
        }
        System.out.println("Before String");
        for(i=0;i<args.length;i++)
        {
            System.out.println("String:"+str[i]);
        }
        try{
        Arrays.sort(str);
         System.out.println("After Sort String");
        }
        catch(Exception e)
        {
         System.out.println("Invalid input.Please enter char values only...!"); 
        }
        for(i=0;i<args.length;i++)
        {
            System.out.println("String"+str[i]);
        }
      
    }
}