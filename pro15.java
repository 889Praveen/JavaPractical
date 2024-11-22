import java.io.*;
public class pro15
{
    public static void main(String[] args)
    {
        FileReader stu=new FileReader("studentfile.txt");
        BufferedReaderbr=new BufferedReader(stu);
        String data=br.readLine();
        
        while(data != -1)
        {
           String arr[]=data.split("\t");
           int sub1=Integer.parseInt(arr[1]);
           int sub2=Integer.parseInt(arr[2]);
           int sub3=Integer.parseInt(arr[3]);
           int sub4=Integer.parseInt(arr[4]);
           int temp=sub1+sub2+sub3+sub4;
           int pre=temp/4;
           System.out.println("Roll NO:"+arr[0]+"Name:"+arr[1]+"Sub1:"+arr[2]+"Sub2:"+arr[3]+"Sub3:"+arr[4]+"Sub4:"+arr[5]+"Pre:"+pre);
        }
    }
}
