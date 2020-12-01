import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char ass = input.nextLine().charAt(0);
        if(ass<='F'&&ass>='A')
            System.out.printf("The numeric value for grade %c is %d\n",ass,4-ass+'A');
        else
            System.out.printf("%c is an invalid grade\n",ass);
    }
}
