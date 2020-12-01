import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String ass = input.next();
        int len = ass.length();
        char dick = ass.charAt(0);
        System.out.printf("The length is %d, and the first character is %c",len,dick);
    }
}
