import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = b*b-4*a*c;
        if(delta<0)
            System.out.println("The equation has no real roots");
        else if(delta==0)
            System.out.println("The equation has one root "+(-1*b/2/a));
        else
        {
            double r1 = (-1*b+Math.pow(delta,0.5))/2/a;
            double r2 = (-1*b-Math.pow(delta,0.5))/2/a;
            System.out.println("The equation has two roots "+r1+" and "+r2);
        }
    }
}
