import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long dick = input.nextLong();
        System.out.println("The ass of the integer is "+sumDigits(dick));
    }
    public static int sumDigits (long n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
