import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter the length from the center to a vertex: ");
        Scanner input = new Scanner(System.in);
        final double PI = 3.141592654;
        double r = input.nextDouble();
        double s = 2*r*Math.sin(PI/5);
        double a = 5*s*s/(4*Math.tan(PI/5));
        System.out.printf("The area of the pentagon is %.2f",a);
    }
}
