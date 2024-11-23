/**
 * PR5
 */
class Matrix {
    int arr1[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int arr2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

    void addition() {
      System.out.println("Adition");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]);
            }
            System.out.println();
        }
    }

    void display() {
        int i;
        System.out.println("Matrix 1");
        for (i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix 2");
        for (i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
    void substraction() {
        System.out.println("Substraction");
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(arr1[i][j]-arr2[i][j]);
              }
              System.out.println();
          }
      }
    void multiplication()
    {
        int mul[][]=new int[arr1.length][arr1.length];
        System.out.println("Multiplication");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                for(int k=0;k<arr1.length;k++)
                {
                   mul[i][j]+=arr1[j][k]*arr2[k][j];
                }
            }
        }
        for (int i = 0; i < mul.length; i++) {

            for (int j = 0; j < 3; j++)
             {
                System.out.print(mul[i][j]);
            }
            System.out.println();
        }
   
    } 

}

public class pro5{

    public static void main(String[] args)
     {
        Matrix obj = new Matrix();
        
        obj.addition();
        obj.substraction();
        obj.multiplication();
        obj.display();
    }
}
