import java.io.*;

public class book {
    public static void main(String[] args)
            throws Exception
    {
        try(
                FileInputStream yamato = new FileInputStream("Exercise17_02.dat");
                ){
            int v=0;
            while(yamato.read()!=-1)
                v++;
            System.out.print(v);
        }
    }
}
