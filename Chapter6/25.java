import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the milliseconds: ");
        long ass = input.nextLong();
        System.out.println(convertMillis(ass));
    }
    public static String convertMillis(long millis)
    {
        long s =millis/1000;
        long se = s%60;
        s/=60;
        long min = s%60;
        s/=60;
        long h = s;
        return h+":"+min+":"+se;
    }
}