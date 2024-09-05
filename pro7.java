import java.util.*;
class stack
{
	int[] stack=new int[5];
	int top;
stack(int x)
{
	top=x;
}
 public void push(int ele)
 {
  if(top==4)
	{
      System.out.println("Stack is Overflow..!");
	}
	else				   
    { 
     top=top+1;
	 stack[top]=ele;
    }
  }
 public int pop()
 {
   	if(top==-1)
	{
	  System.out.println("Stack is underflow..!");
	}	
   else
   {
	   int ele,i,New;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Delete Element:");
	   ele=sc.nextInt();
	   for(i=0;i<=top;i++)
	   {
		   if(stack[i]==ele)
		   {
			    System.out.print("Enter New Element:");  
				New=sc.nextInt();
				stack[i]=New;
		   }
	   }
   }	
   return 0;   
 }
 public void traverse()
 {
	 int i;
	  System.out.print("Display:");
	 for(i=0;i<=top;i++)
	 {
		 System.out.println(stack[i]);
	 }
 }
}
public class pro7
{
  public static void main(String args[])
  {
    
	int choice;
	Scanner sc=new Scanner(System.in);
	stack obj=new stack(-1);
   while(true)
   {
	System.out.println("Enter One for Push..");
	System.out.println("Enter Two for Pop..");
	System.out.println("Enter Three for Display..");
	System.out.print("Enter Number of choice:");
	choice=sc.nextInt();
	switch(choice)
	{
		case 1:
					 int ele;
		             System.out.println("Enter Number of Element:");
		             ele=sc.nextInt();
		             obj.push(ele);
				     break;
		case 2:
		             obj.pop();
					 break;
		case 3:
		             obj.traverse();
					 break;
	                
   }
  }
 }
}