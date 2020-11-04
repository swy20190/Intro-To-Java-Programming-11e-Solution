import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius:");
        double c = input.nextDouble();
        double h = (9.0/5)*c+32;
        System.out.println(c+" Celsius is "+h+" Fahrenheit.");
    }
}
