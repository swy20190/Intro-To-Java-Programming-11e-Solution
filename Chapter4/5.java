import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        final double PI = 3.141592654;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        double a = n*s*s/(4*Math.tan(PI/n));
        System.out.println("The area of the polygon is "+a);
    }
}
