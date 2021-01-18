import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        System.out.println(s+" has "+countLetters(s)+" letters.");
    }
    public static int countLetters(String s)
    {
        int len=s.length();
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<len;i++) {
            if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
                count++;
        }
        return count;
    }
}