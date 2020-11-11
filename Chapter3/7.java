import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 114.514:");
        double amount = input.nextDouble();
        int remainAmount = (int)(amount*100);
        int numberOfDollars = remainAmount/100;
        remainAmount%=100;
        int numberOfQuarters = remainAmount/25;
        remainAmount%=25;
        int numberOfDimes = remainAmount/10;
        remainAmount%=10;
        int numberOfNickels = remainAmount/5;
        remainAmount%=5;
        int numberOfPennies = remainAmount;
        System.out.println("Your amount "+amount+" consists of");
        if(numberOfDollars>0)
        {
            System.out.print(numberOfDollars);
            if(numberOfDollars>1)
                System.out.println(" dollars");
            else
                System.out.println(" dollar");
        }
        if(numberOfQuarters>0)
        {
            System.out.print(numberOfQuarters);
            if(numberOfQuarters>1)
                System.out.println(" quarters");
            else
                System.out.println(" quarter");
        }
        if(numberOfDimes>0)
        {
            System.out.print(numberOfDimes);
            if(numberOfDimes>1)
                System.out.println(" dimes");
            else
                System.out.println(" dime");
        }
        if(numberOfNickels>0)
        {
            System.out.print(numberOfNickels);
            if(numberOfNickels>1)
                System.out.println(" nickels");
            else
                System.out.println(" nickel");
        }
        if(numberOfPennies>0)
        {
            System.out.print(numberOfPennies);
            if(numberOfPennies>1)
                System.out.println(" pennies");
            else
                System.out.println(" penny");
        }
    }
}
