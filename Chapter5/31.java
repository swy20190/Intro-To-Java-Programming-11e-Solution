import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double money = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double rate = input.nextDouble();
        System.out.print("Enter maturity period (number of month): ");
        int month = input.nextInt();
        System.out.println("Month    CD Value");
        for(int i=1;i<=month;i++)
        {
            money*=(1+rate/1200);
            System.out.printf("%2d      %.2f\n", i,money);
        }
    }
}
