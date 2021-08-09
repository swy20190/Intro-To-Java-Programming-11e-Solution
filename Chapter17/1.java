import java.io.*;

public class book {
    public static void main(String[] args)
            throws Exception
    {
        File dst = new File("Exercise17_01.txt");
        FileWriter fw = new FileWriter(dst,true);
        try(
                PrintWriter output = new PrintWriter(fw);){
            for(int i=0;i<100;i++) {
                output.print((int) (Math.random() * 100)+" ");
            }
            output.print('\n');
        }

    }
}
