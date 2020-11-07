import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double jb = a*d-b*c;
        if(jb==0)
            System.out.println("The equation has no solution");
        else
            System.out.println("x is "+(e*d-b*f)/jb+" and y is "+(a*f-e*c)/jb);
    }
}
