import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value in pounds:");
        double pounds = input.nextDouble();
        double kilograms = pounds*0.454;
        System.out.println(pounds+" pounds is "+kilograms+" kilograms.");
    }
}
