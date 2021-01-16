import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String ass = input.nextLine();
        int len = ass.length();
        int countC = 0;
        for(int i=0;i<len;i++) {
            if (ass.charAt(i) >= 'A' && ass.charAt(i) <= 'Z')
                countC++;
        }
        System.out.println("The number of upper case letter is "+countC);
    }
}
