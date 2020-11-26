import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        String[] bins = {"0","1","10","11","100","101","110","111","1000","1001","1010","1011","1100","1101","1110","1111"};
        System.out.print("Enter a hex digit: ");
        Scanner input = new Scanner(System.in);
        char ass = input.nextLine().charAt(0);
        if(ass>='0'&&ass<='9')
            System.out.printf("The binary value is %s\n",bins[ass-'0']);
        else if(ass>='A'&&ass<='F')
            System.out.printf("The binary value is %s\n",bins[ass-'A'+10]);
        else
            System.out.printf("%c is an invalid input\n",ass);
    }
}
