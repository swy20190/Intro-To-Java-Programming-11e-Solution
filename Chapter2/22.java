import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in int, for example 114514:");
        int amount = input.nextInt();
        int old = amount;
        int numberOfOneDollars = amount/100;
        amount%=100;
        int numberOfQuarters = amount/25;
        amount%=25;
        int numberOfDimes = amount/10;
        amount%=10;
        int numberOfNickles = amount/5;
        amount%=5;
        int numberOfPennies = amount;
        System.out.println("Your amount "+old+" consists of");
        System.out.println("    "+numberOfOneDollars+" dollars");
        System.out.println("    "+numberOfQuarters+" quarters");
        System.out.println("    "+numberOfDimes+" dimes");
        System.out.println("    "+numberOfNickles+" nickels");
        System.out.println("    "+numberOfPennies+" pennies");
    }
}
