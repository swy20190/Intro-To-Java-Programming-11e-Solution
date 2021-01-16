import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String ass = input.nextLine();
        int len = ass.length();
        for(int i=0;i<len;i+=2)
            System.out.print(ass.charAt(i));
        System.out.println("");
    }
}
