import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualRate = input.nextDouble();
        double monthRate = annualRate/1200;
        double monthPay = amount*monthRate/(1-1/(Math.pow(1+monthRate,12*years)));
        double total = monthPay*years*12;
        System.out.printf("Monthly Payment: %.2f\n",monthPay);
        System.out.printf("Total Payment: %.2f\n",total);
        System.out.println("Payment# Interest   Principle   Balance");
        double balance = amount;
        for(int i=1;i<=years*12;i++)
        {
            double interest = monthRate*balance;
            double principle = monthPay-interest;
            balance = balance-principle;
            System.out.printf("%d\t\t %.2f\t\t%.2f\t\t%.2f\n",i,interest,principle,balance);
        }
    }
}
