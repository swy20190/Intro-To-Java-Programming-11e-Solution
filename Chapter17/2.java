import java.io.*;

public class book {
    public static void main(String[] args)
            throws Exception
    {
        try(FileOutputStream musashi = new FileOutputStream("Exercise17_02.dat",true);)
        {
            for(int i=0;i<100;i++)
                musashi.write((int)(Math.random()*100));
        }

    }
}
