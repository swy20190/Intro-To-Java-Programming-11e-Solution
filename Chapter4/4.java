import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        final double PI = 3.141592654;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        double a = 6*s*s/(4*Math.tan(PI/6));
        System.out.println("The area of the hexagon is "+a);
    }
}
