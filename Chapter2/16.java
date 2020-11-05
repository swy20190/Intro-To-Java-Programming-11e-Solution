import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side:");
        double s = input.nextDouble();
        double a = 3*Math.pow(3,0.5)/2*s*s;
        System.out.println("The area of the hexagon is "+a+".");
    }
}
