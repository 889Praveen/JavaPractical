import java.util.*;
class StackException extends Exception
{
   
 public StackException(String a)
 {
    super(a);
 }
}
class Stack 
{
    int stack[];
    int top=-1;
    Stack(int x)
    {
       stack=new int[x];
    }
    public int push()
    {
        try
        {
        if(top==stack.length-1)
        {
            throw new StackException("Stack is Overflow..!");
        }
       top++;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number of Element:");
       int temp=sc.nextInt();
       stack[top]=temp;
    }
     catch(StackException e)
     {
        System.out.println(e.getMessage());
     } 
     return top;
    }
    public void pop()
    {
    try{
       if(top==-1)
        {
            throw new StackException("Stack is Underflow..!");
        }
        else
        {
            top--;
        }
        }
        catch(StackException e)
        {
            System.out.println(e.getMessage());
        }
    }
public void display()
{
  int i;
  try
  {
  if(top==-1)
  {
    throw new StackException("Stack is Empty..!");
  }
  else
  {
  System.out.println("Stack:");
  for(i=0;i<=top;i++)
  {
    System.out.println(stack[i]);
  }
  }
}
catch(StackException e)
{
    System.out.println(e.getMessage());
}
}
}
public class pro12
{
    public static void main(String args[])
    {
        Stack obj=new Stack(5);
         int top;
        while(true)
        {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter One For Push..:");
             System.out.println("Enter Two For Pop..");
             System.out.println("Enter Three For Display..");
             System.out.println("Enter Choice:");
             int temp=sc.nextInt();
            switch(temp)
            {
             case 1:
                top=obj.push();
                 break;
            case 2:
                 obj.pop();
                 break;
            case 3:
                 obj.display();
                 break;  
            default:
                 System.out.println("please Enter Valid Choice..");       
            }
        }
    }
}