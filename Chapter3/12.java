import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter a three-digit integer:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int old = num;
        if(num<0)
            num*=(-1);
        int gewei = num%10;
        int baiwei = num/100;
        if(gewei==baiwei)
            System.out.println(old+" is a palindrome.");
        else
            System.out.println(old+" is not a palindrome.");
    }
}
