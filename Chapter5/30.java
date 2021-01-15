import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the money: ");
        double money = input.nextDouble();
        double plus = money;
        System.out.print("Enter year rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter the months: ");
        int months = input.nextInt();
        for(int i=1;i<months;i++)
            money=(money+plus)*(1+rate/1200);
        System.out.printf("The result money is %.3f\n",money);
    }
}
