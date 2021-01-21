import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter 5 numbers: ");
        Scanner input = new Scanner(System.in);
        int[] ass = new int[5];
        for(int i=0;i<5;i++)
        {
            ass[i]=input.nextInt();
        }
        System.out.println("The gcd of the numbers is "+gcd(ass));
    }
    public static int gcd(int... numbers)
    {
        if(numbers.length==1)
            return numbers[0];
        else if(numbers.length==2)
            return gcd(numbers[0],numbers[1]);
        else
        {
            int gcd = gcd(numbers[0],numbers[1]);
            for(int i=2;i<numbers.length;i++)
                gcd=gcd(gcd,numbers[i]);
            return gcd;
        }
    }
    public static int gcd(int n1,int n2)
    {
        int gkd = Math.min(n1,n2);
        while((!(n1%gkd==0&&n2%gkd==0))&&gkd>=2)
            gkd--;
        return gkd;
    }
}