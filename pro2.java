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

        Arrays.sort(str);
         System.out.println("After Sort String");
         
        for(i=0;i<args.length;i++)
        {
            System.out.println("String"+str[i]);
        }
    }
}