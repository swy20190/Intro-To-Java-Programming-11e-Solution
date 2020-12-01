import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ass = input.nextLine().charAt(0);
        if((ass<='c'&&ass>='a')||(ass<='C'&&ass>='A'))
            System.out.println("The corresponding number is 2");
        else if((ass<='f'&&ass>='d')||(ass<='F'&&ass>='D'))
            System.out.println("The corresponding number is 3");
        else if((ass<='i'&&ass>='g')||(ass<='I'&&ass>='G'))
            System.out.println("The corresponding number is 4");
        else if((ass<='l'&&ass>='j')||(ass<='L'&&ass>='J'))
            System.out.println("The corresponding number is 5");
        else if((ass<='o'&&ass>='m')||(ass<='O'&&ass>='M'))
            System.out.println("The corresponding number is 6");
        else if((ass<='s'&&ass>='p')||(ass<='S'&&ass>='P'))
            System.out.println("The corresponding number is 7");
        else if((ass<='v'&&ass>='t')||(ass<='V'&&ass>='T'))
            System.out.println("The corresponding number is 8");
        else if((ass<='z'&&ass>='w')||(ass<='Z'&&ass>='W'))
            System.out.println("The corresponding number is 9");
        else
            System.out.println(ass+" is an invalid input");
    }
}
