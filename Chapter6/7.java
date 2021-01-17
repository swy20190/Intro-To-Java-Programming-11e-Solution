import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double ar = input.nextDouble();
        System.out.println("Years    Future Value");
        for(int i=1;i<=30;i++)
            System.out.printf("%-2d      %9.2f\n",i,futureInvestmentValue(amount,ar/1200,i));
    }
    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate,int years
    )
    {
        return investmentAmount*Math.pow((1+monthlyInterestRate),years*12);
    }
}
