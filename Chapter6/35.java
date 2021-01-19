import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double ass = input.nextDouble();
        System.out.println("The area of the pentagon is "+area(ass));
    }
    public static double area(double side)
    {
        return 5*side*side/(4*Math.tan(3.141592654/5));
    }
}
