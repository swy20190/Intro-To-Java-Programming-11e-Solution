import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms:");
        double m = input.nextDouble();
        System.out.print("Enter the initial temperature:");
        double it = input.nextDouble();
        System.out.print("Enter the final temperature:");
        double ft = input.nextDouble();
        double q = m*(ft-it)*4184;
        System.out.println("The energy needed is "+q+".");
    }
}
