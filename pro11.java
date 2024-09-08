class customeExxception extends Exception
{
	public customeExxception (String a)
	{
		super(a);
		
	}
}
public class pro11 {
    public static void main(String[] args) {
        
		int number[]=new int[args.length];
        try
        {
        for(int i=0;i<args.length;i++)
        {
            
			number[i]=Integer.parseInt(args[i]);
			if(number[i]<0)
		     {
				 
				 throw new customeExxception("Number is Nagetive...!");
				  
			 }
			 System.out.println("Number is positive:"+number[i]);
        }
        }
		
		catch(customeExxception e)
        {
            System.out.println("Error:"+e.getMessage());
        }
    }
}