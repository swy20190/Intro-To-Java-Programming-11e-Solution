import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount:");
        double m = input.nextDouble();
        double sum = 0.0;
        for(int i=0;i<6;i++)
            sum = (m+sum)*(1+0.00417);
        System.out.println("After the sixth month, the account value is $"+sum+".");
    }
}
