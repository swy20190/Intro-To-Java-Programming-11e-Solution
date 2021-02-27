import java.util.Random;
public class book {
    public static void main(String[] args)
    {
        Random r = new Random(1000);
        for(int i=0;i<50;i++)
            System.out.print(r.nextInt(100)+" ");
    }
}