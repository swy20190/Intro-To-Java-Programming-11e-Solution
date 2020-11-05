import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount:");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double ar = input.nextDouble();
        System.out.print("Enter number of years:");
        int y = input.nextInt();
        double fv = amount*Math.pow(1+ar/1200,y*12);
        System.out.println("Future value is $"+fv);
    }
}
