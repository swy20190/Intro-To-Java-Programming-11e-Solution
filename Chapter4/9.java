import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String jb = input.nextLine();
        char ass = jb.charAt(0);
        int dick = (int)ass;
        System.out.printf("The Unicode for the character %c is %d",ass,dick);
    }
}
