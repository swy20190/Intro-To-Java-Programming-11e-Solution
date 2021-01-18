import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        int len = s.length();
        s=s.toUpperCase();
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)<='Z'&&s.charAt(i)>='A')
                System.out.print(getNumber(s.charAt(i)));
            else
                System.out.print(s.charAt(i));
        }
        System.out.print('\n');
    }
    public static int getNumber(char uppercaseLetter)
    {
        if(uppercaseLetter=='A'||uppercaseLetter=='B'||uppercaseLetter=='C')
            return 2;
        else if(uppercaseLetter=='D'||uppercaseLetter=='E'||uppercaseLetter=='F')
            return 3;
        else if(uppercaseLetter=='G'||uppercaseLetter=='H'||uppercaseLetter=='I')
            return 4;
        else if(uppercaseLetter=='J'||uppercaseLetter=='K'||uppercaseLetter=='L')
            return 5;
        else if(uppercaseLetter=='M'||uppercaseLetter=='N'||uppercaseLetter=='O')
            return 6;
        else if(uppercaseLetter=='P'||uppercaseLetter=='Q'||uppercaseLetter=='R'||uppercaseLetter=='S')
            return 7;
        else if(uppercaseLetter=='T'||uppercaseLetter=='U'||uppercaseLetter=='V')
            return 8;
        else
            return 9;
    }
}