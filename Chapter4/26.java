import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in string, for example 114.514: ");
        String rawMoney = input.next();
        int remains = 0;
        int dot = rawMoney.indexOf('.');
        if(dot==-1)
            remains=Integer.parseInt(rawMoney)*100;
        else
        {
            int dollars=Integer.parseInt(rawMoney.substring(0,dot));
            int cents = 0;
            if(rawMoney.length()-dot==1)
                cents=10*Integer.parseInt(rawMoney.substring(dot+1));
            else
                cents=Integer.parseInt(rawMoney.substring(dot+1,dot+3));
            remains=dollars*100+cents;
        }
        int numdoll = remains/100;
        remains=remains%100;
        int numqua = remains/25;
        remains=remains%25;
        int numdi = remains/10;
        remains = remains%10;
        int numni = remains/5;
        remains = remains%5;
        int nump = remains;
        System.out.println("Your amount "+rawMoney+" consists of");
        System.out.println("    "+numdoll+" dollars");
        System.out.println("    "+numqua+" quarters");
        System.out.println("    "+numdi+" dimes");
        System.out.println("    "+numni+" nickels");
        System.out.println("    "+nump+" pennies");
    }
}
