import java.util.*;
import java.io.*;

public class book {
    public static void main(String[] args)
            throws Exception
    {
        int[] PoW = {1,2,3,4,5};
        Date KGV = new Date();
        double DoY = 5.5;
        try(
                ObjectOutputStream Bismark = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"));
                ){
            Bismark.writeObject(PoW);
            Bismark.writeObject(KGV);
            Bismark.writeDouble(DoY);
        }
        try(
                ObjectInputStream Tilpitz = new ObjectInputStream(new FileInputStream("Exercise17_05.dat"));
                ){
            int[] ss= (int[])(Tilpitz.readObject());
            Date jj=(Date)(Tilpitz.readObject());
            double bb= Tilpitz.readDouble();
            for(int i=0;i<ss.length;i++)
                System.out.print(ss[i]+" ");
            System.out.println('\n'+jj.toString());
            System.out.print(bb);
        }
    }
}
