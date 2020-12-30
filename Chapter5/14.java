import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int jb = Math.min(n1,n2);
        for(int i=jb;i>=1;i--)
        {
            if(n1%i==0&&n2%i==0)
            {
                System.out.println("The gcd is "+i);
                break;
            }
        }
    }
}
