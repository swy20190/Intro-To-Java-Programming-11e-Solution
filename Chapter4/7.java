import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        final double PI = 3.141592654;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextDouble();
        double base = 0.1*PI;
        System.out.println("The coordinates of fibe points on the pentagon are");
        for(int i=0;i<5;i++)
        {
            System.out.printf("(%.2f, %.2f)%n",r*Math.cos(base),r*Math.sin(base));
            base+=0.4*PI;
        }
    }
}
