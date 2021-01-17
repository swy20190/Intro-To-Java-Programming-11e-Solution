import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int pussy = input.nextInt();
        if(isPalindrome(pussy))
            System.out.println(pussy+" is a palindrome.");
        else
            System.out.println(pussy+" is not a palindrome.");
    }
    public static int reverse(int number)
    {
        String ass = Integer.toString(number);
        String dick = "";
        for(int i=ass.length()-1;i>=0;i--)
            dick+=ass.charAt(i);
        return Integer.parseInt(dick);
    }
    public static boolean isPalindrome(int number)
    {
        return number==reverse(number);
    }
}
