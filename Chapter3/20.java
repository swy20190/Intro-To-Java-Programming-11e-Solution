import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double t = input.nextDouble();
        System.out.print("Enter the velocity: ");
        double v = input.nextDouble();
        double twc = 35.74+0.6215*t-35.75*Math.pow(v,0.16)+0.4275*t*Math.pow(v,0.16);
        if(t>=-58&&t<=41&v>=2)
            System.out.println("The twc is "+twc);
        else
            System.out.println("Invalid input.");
    }
}
