import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int pos = 0;
        int neg = 0;
        double sum = 0;
        int amo = 0;
        while(true)
        {
            int tmp = input.nextInt();
            if(tmp==0)
                break;
            else
            {
                amo++;
                sum+=tmp;
                if(tmp>0)
                    pos++;
                else
                    neg++;
            }
        }
        double ave = sum/amo;
        if(amo==0)
            System.out.println("No numbers are entered except 0");
        else {
            System.out.println("The number of positives is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + ave);
        }
    }
}