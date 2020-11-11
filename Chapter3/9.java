import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbnNum = input.nextInt();
        int old = isbnNum;
        for(int i=9;i>=1;i--)
        {
            sum+=isbnNum%10*i;
            isbnNum/=10;
        }
        int tail = sum%11;
        System.out.printf("The ISBN-10 number is %09d",old);
        if(tail<10)
            System.out.println(tail);
        else
            System.out.println("X");
    }
}
