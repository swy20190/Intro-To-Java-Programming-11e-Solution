import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        int min = input.nextInt();
        int days = min/60/24;
        int years = days/365;
        days %= 365;
        System.out.println(min+" minutes is approximately "+years+" years and "+days+" days.");
    }
}
