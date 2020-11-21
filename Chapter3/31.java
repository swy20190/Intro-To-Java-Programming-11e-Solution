import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollar to RMB: ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int sig = input.nextInt();
        double in = 0;
        double out = 0;
        String moneyType = "";
        if(sig==0)
            moneyType="dollar";
        else if(sig==1)
            moneyType="RMB";
        else
            System.out.println("Incorrect input");
        if(sig==0||sig==1)
        {
            System.out.print("Enter the "+moneyType+" amount: ");
            in = input.nextDouble();
            if(sig==0)
            {
                out = in*rate;
                System.out.println("$"+in+" is "+out+" yuan");
            }
            else
            {
                out = in/rate;
                System.out.println(in+" yuan is $"+out);
            }
        }
    }
}