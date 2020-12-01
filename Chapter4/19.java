import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as String: ");
        String ass = input.next();
        int sum=0;
        for(int i=1;i<=9;i++)
            sum+=(ass.charAt(i-1)-'0')*i;
        int tail = sum%11;
        if(tail==10)
            ass=ass+"X";
        else
            ass=ass+tail;
        System.out.println("The ISBN-10 number is "+ass);
    }
}
