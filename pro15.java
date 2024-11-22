import java.io.*;
class pro15
{
    public static void main(String[] args)
    {
        FileReader stu=new FileReader("FileName.txt");
        BufferReader br=new BufferReader(stu);
        String data=br.readline();
        
        while(data != -1)
        {
           String arr[]=data.split("\t");
           int sub1=Integer.parseInt(arr[1]);
           int sub2=Integer.parseInt(arr[2]);
           int sub3=Integer.parseInt(arr[3]);
           int sub4=Integer.parseInt(arr[4]);
           int temp=sub1+sub2+sub3+sub4;
        }
    }
}