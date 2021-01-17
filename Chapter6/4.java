import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int pussy = input.nextInt();
        reverse(pussy);
    }
    public static void reverse(int number)
    {
        String ass = Integer.toString(number);
        String dick = "";
        for(int i=ass.length()-1;i>=0;i--)
            dick+=ass.charAt(i);
        System.out.println(dick);
    }
}
