import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ass = input.nextInt();
        int mi = 1;
        while(Math.pow(2,mi)<=ass)
            mi++;
        mi--;
        for(int i=mi;i>=0;i--)
        {
            if(ass>=Math.pow(2,i))
            {
                System.out.print(1);
                ass-=Math.pow(2,i);
            }
            else
                System.out.print(0);
        }
    }
}
