import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int ass = input.nextInt();
        while(ass!=1)
        {
            for(int i=2;i<=ass;i++)
            {
                if(ass%i==0)
                {
                    ass=ass/i;
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
