import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();
        double av1 = p1/w1;
        double av2 = p2/w2;
        if(av1<av2)
            System.out.println("Package 1 has a better price.");
        else if(av1==av2)
            System.out.println("Two packages have the same price.");
        else
            System.out.println("Package 2 has a better price.");
    }
}