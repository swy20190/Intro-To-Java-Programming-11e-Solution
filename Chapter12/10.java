import java.util.*;

public class book {
    public static void main(String[] args)
    {
        ArrayList<Double> h = new ArrayList<Double>();
        double i = 114514;
        while(true){
            i++;
            try{
                h.add(i);
            }
            catch(OutOfMemoryError killerQueen){
                System.out.print("Ohhhhhh!");
                System.exit(1);
            }
        }
    }
}
