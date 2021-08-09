import java.util.*;
import java.io.*;

public class book {
    public static void main(String[] args)
            throws Exception
    {
        System.out.print("Enter the src: ");
        Scanner input = new Scanner(System.in);
        String jj = input.next();
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        RandomAccessFile src = new RandomAccessFile(jj,"r");
        src.seek(0);
        long llen = src.length()/num;
        for(int i=1;i<=num;i++){
            RandomAccessFile tmp = new RandomAccessFile(jj+"."+i,"rw");
            for(long j=0;j<llen;j++){
                int kk = src.read();
                if(kk==-1)
                    break;
                else
                    tmp.write(kk);
            }
            tmp.close();
        }
        src.close();
    }
}
