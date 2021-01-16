import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String ass = input.nextLine();
        System.out.print("The reversed string is ");
        for(int i=ass.length()-1;i>=0;i--)
            System.out.print(ass.charAt(i));
        System.out.print('\n');
    }
}
