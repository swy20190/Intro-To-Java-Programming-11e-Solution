import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter thr number of sides: ");
        int n=input.nextInt();
        System.out.print("Enter the side: ");
        double ass = input.nextDouble();
        System.out.println("The area of the polygon is "+area(n,ass));
    }
    public static double area(int n,double side)
    {
        return n*side*side/(4*Math.tan(3.141592654/n));
    }
}
