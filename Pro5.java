import java.util.*;
class matrix
{
 int[][] arr1=new int[][]{{1,1,1},{2,2,2},{3,3,3}};
 int[][] arr2=new int[][]{{1,1,1},{2,2,2},{3,3,3}};
 int i,j;
 public void addition()
 {
	 for(i=0;i<3;i++)
	 {
		 for(j=0;j<3;j++)
		 {
			 System.out.print(arr1[i][j]+arr2[i][j]);
		 }
		 System.out.println(" ");
	 }
 } 
}
public class pro5
{
	public static void main(String args[])
	{
		matrix obj=new matrix();
		Scanner sc=new Scanner();
		System.out.println("Enetr One For Addition..");
		System.out.println("Enter Choice;");
		int temp=sc.nextInt();
		switch(temp)
		{
		  case 1:obj.addition();
		          break;
	    }
	}
}