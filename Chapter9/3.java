import java.util.Date;
public class book {
    public static void main(String[] args)
    {
        long second = 10000;
        for(int i=0;i<8;i++)
        {
            Date curr = new Date(second);
            System.out.println(curr.toString());
            second*=10;
        }
    }
}