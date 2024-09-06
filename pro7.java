import java.util.*;
class stack
{
	int stack[];
	int top=-1,y;
stack(int x)
{
	stack=new int[x];
     y=x;
 
}
 public void push(int ele)
 {
	 
  if(top==y-1)
	{
      System.out.println("Stack is Overflow..!");
	}
	else				   
    { 
     top++;
	 stack[top]=ele;
	  if(top==y-1)
	{
      System.out.println("Stack is Overflow..!");
	}
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
	   int ele,i,count=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Delete Element:");
	   ele=sc.nextInt();
	   for(i=0;i<=top;i++)
	   {
		   if(stack[i]==ele)
		   {
				stack[i]=0;
				count++;
				break;
		   }
	   }
	   if(i!=top)
	   {
	   for(i=i;i<=top;i++)
	   {
		   stack[i]=stack[i+1];  
	   }
	   }
	   top--;
	 if(count==1) 
	 {
		 System.out.println("Delete Element Seccessfull..");
	 }
	 else
	 {
		 if(count==0)
		 {		 
		 System.out.println("Element is Not in Array..!");
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
	int temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array len...");
	temp=sc.nextInt();
	stack obj=new stack(temp);
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