import java.util.*;
import java.io.*;

public class book {
    public static void main(String[] args)
            throws Exception
    {
        System.out.print("Enter the src and dst: ");
        Scanner input = new Scanner(System.in);
        String jj = input.next();
        String mm = input.next();
        RandomAccessFile src = new RandomAccessFile(jj,"r");
        RandomAccessFile dst = new RandomAccessFile(mm,"rw");
        src.seek(0);
        for(int i=0;i<src.length();i++)
        {
            int tmp=src.read();
            tmp-=5;
            dst.write(tmp);
        }
        src.close();
        dst.close();
    }
}
