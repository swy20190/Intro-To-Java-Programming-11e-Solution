import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int num = input.nextInt();
        int d1 = num%10;
        num/=10;
        int d2 = num%10;
        num/=10;
        int s = num+d1+d2;
        System.out.println("The sum of the digits is "+s+".");
    }
}
