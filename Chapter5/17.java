import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter the number of lines: ");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=7-i;j++)
                System.out.print("  ");
            for(int j=i;j>1;j--)
                System.out.print(j+" ");
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.print('\n');
        }
    }
}
