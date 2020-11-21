import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Is "+n+" divisible by 5 and 6? "+(n%5==0&&n%6==0));
        System.out.println("Is "+n+" divisible by 5 or 6? "+(n%5==0||n%6==0));
        System.out.println("Is "+n+" divisible by 5 or 6, but not both? "+(n%5==0^n%6==0));
    }
}