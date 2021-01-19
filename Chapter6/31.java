import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        String ass = input.next();
        if(isValid(ass))
            System.out.println(ass+" is valid");
        else
            System.out.println(ass+" is invalid");
    }
    public static boolean isValid(String number)
    {
        if(number.length()<13||number.length()>16)
            return false;
        else
        {
            return (sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10==0;
        }
    }
    public static int sumOfDoubleEvenPlace(String number)
    {
        int sum=0;
        for(int i=number.length()-2;i>=0;i-=2)
            sum+=getDigit(2*(number.charAt(i)-'0'));
        return sum;
    }
    public static int getDigit(int number)
    {
        if(number<10)
            return number;
        else
            return number/10+number%10;
    }
    public static int sumOfOddPlace(String number)
    {
        int sum=0;
        for(int i=number.length()-1;i>=0;i-=2)
            sum+=(int)(number.charAt(i)-'0');
        return sum;
    }
    public static boolean prefixMatched(String number)
    {
        char c1=number.charAt(0);
        char c2=number.charAt(1);
        return c1 == '4' || c1 == '5' || c1 == '6' || (c1 == '3') && (c2 == 7);
    }
}
