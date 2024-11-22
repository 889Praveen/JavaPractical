import java.io.*;
class pro14
{
    public static void main(String[] args)
    {
        int data;
        int copydata;
        try{
        FileInputStream file=new FileInputStream(args[0]);
        FileOutputStream newfile=new FileOutputStream(args[1]);

        
        do
        {
            data=file.read();
            newfile.write(data);

        }while(data != -1);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}