import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String ass = input.nextLine();
        int len = ass.length();
        ass=ass.toLowerCase();
        int countV =0;
        int countC = 0;
        for(int i=0;i<len;i++)
        {
            char tmp = ass.charAt(i);
            if(tmp=='a'||tmp=='e'||tmp=='i'||tmp=='o'||tmp=='u')
                countV++;
            else if(tmp!=' ')
                countC++;
        }
        System.out.println("The number of vowels is "+countV);
        System.out.println("The number of consonants is "+countC);
    }
}
