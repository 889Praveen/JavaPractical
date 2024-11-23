
import java.util.Scanner;

class Matrix {

    int arr1[][];
    int arr2[][];
    int i,j;
    int temp;
    Scanner scanner = new Scanner(System.in);

    void arrsize() 
    {
        System.out.println("Enter array size:");
        temp = scanner.nextInt();
        arr1 = new int[temp][temp];
        arr2 = new int[temp][temp];
    }

    void getInput1()
     {
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < 3; i++)
         {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("arr1[" + i + "][" + j + "]: ");
                arr1[i][j] = scanner.nextInt();
            }
         }
            for (i = 0; i < 3; i++) 
            {
                for (j = 0; j < 3; j++) 
                {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println(" ");
            }
    }

    void getInput2() 
    {
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
             {
                System.out.print("arr2[" + i + "][" + j + "]: ");
                arr2[i][j] = scanner.nextInt();
             }
        }
        for (i = 0; i < 3; i++)
         {
            for (j = 0; j < 3; j++)
             {
                System.out.print(arr2[i][j] + " ");
             }
            System.out.println(" ");
         }
    }

    void addition()
     {
        System.out.println("Adition");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(arr1[i][j] + arr2[i][j]+"  ");
            }
            System.out.println("");
        }
    }

    
    void substraction() {
        System.out.println("Substraction");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] - arr2[i][j]+"  ");
            }
            System.out.println("");
        }
    }

    void multiplication() {
        int mul[][] = new int[arr1.length][arr1.length];
        System.out.println("Multiplication");
        for (int i = 0; i < arr1.length; i++)
         {
            for (int j = 0; j < arr1.length; j++)
             {
                for (int k = 0; k < arr1.length; k++) 
                {
                    mul[i][j] += arr1[j][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < mul.length; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(mul[j][i]+"  ");
            }
            System.out.println("");
        }

    }

}

public class demo{

    public static void main(String[] args) {
        Matrix obj = new Matrix();
        int temp;
        Scanner scanner = new Scanner(System.in);
        obj.arrsize();
        obj.getInput1();
        obj.getInput2();
        while(true)
        {
            System.out.println("Enter Choice:");
            temp=scanner.nextInt();
            switch(temp)
            {
               case 1:
                      obj.addition();
                      break;
                case 2:
                      obj.substraction();
                      break;
                case 3:
                      obj.multiplication();
                      break;
                default:
                    System.out.println("Eneter Valid Choice...!");
            }
        }
       
    }
}
