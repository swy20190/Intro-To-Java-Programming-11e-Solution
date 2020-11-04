import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        double pi = 3.141592654;
        System.out.print("Enter the radius and length of a cylinder:");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double l = input.nextDouble();
        double s = r*r*pi;
        double v = s*l;
        System.out.println("The area is "+s);
        System.out.println("The volume is "+v);
    }
}
