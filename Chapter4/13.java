import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ass = input.nextLine().charAt(0);
        if((ass<='z'&&ass>='a')||(ass<='Z'&&ass>='A'))
        {
            if(ass=='a'||ass=='e'||ass=='i'||ass=='o'||ass=='u'
            ||ass=='A'||ass=='E'||ass=='I'||ass=='O'||ass=='U')
                System.out.println(ass+" is a vowel");
            else
                System.out.println(ass+" is a consonant");
        }
        else
            System.out.println(ass+" is an invalid input");
    }
}
