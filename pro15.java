import java.io.*;
public class pro15
{
        public static void main(String[] args) throws IOException
    {
        FileReader stu=new FileReader("studentfile.txt");
        try (BufferedReader br = new BufferedReader(stu)) {
            String data=br.readLine();
            System.out.println("Roll NO" + "  Name"  +    "     Sub1"  +  "    Sub2" +  "    Sub3"  +  "    Sub4" + "    Precentage");
            while (data != null)
            {    
               String arr[]=data.split("\t");
               int sub1=Integer.parseInt(arr[2]);
               int sub2=Integer.parseInt(arr[3]);
               int sub3=Integer.parseInt(arr[4]);
               int sub4=Integer.parseInt(arr[5]);
               int temp=sub1+sub2+sub3+sub4;
               float pre=temp/4;
               System.out.println(arr[0]+"  "+arr[1] +"   "+arr[2]+"     "+arr[3]+"       "+arr[4]+"     "+arr[5]+"       "+pre);
               data=br.readLine();
            }
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }
    }
}
