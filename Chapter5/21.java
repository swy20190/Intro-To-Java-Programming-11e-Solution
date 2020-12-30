import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Interest Rate      Monthly Payment      Total Payment");
        for(int i = 0;i<25;i++)
        {
            double rate = (0.125*i+5)/1200;
            double monthMoney = amount*rate/(1-1/Math.pow(1+rate,years*12));
            System.out.printf("%-4.3f%%             %-5.2f               %-7.2f\n",0.125*i+5,monthMoney,monthMoney*12*years);
        }
    }
}
