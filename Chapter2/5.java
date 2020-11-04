import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate:");
        double t = input.nextDouble();
        double g = input.nextDouble();
        double extra = t*g/100.0;
        double s = extra+t;
        System.out.println("The gratuity is $"+extra+" and total is $"+s+".");
    }
}
