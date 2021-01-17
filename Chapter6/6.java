import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=input.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
                System.out.print("   ");
            for(int j=i;j>=1;j--)
                System.out.printf("%3d",j);
            System.out.print('\n');
        }
    }
}
