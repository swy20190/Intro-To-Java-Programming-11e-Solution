import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches:");
        double inches = input.nextDouble();
        double bmi = pounds*0.4535927/(inches*inches*0.0254*0.0254);
        System.out.println("BMI is "+bmi+".");
    }
}
