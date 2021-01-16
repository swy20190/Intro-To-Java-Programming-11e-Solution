import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your target: ");
        final double COMMISSION_SOUGHT = input.nextDouble();
        double ass = COMMISSION_SOUGHT/0.08+5000;
        int i=1;
        for(i=1;i<ass;i++)
        {
            double ticheng = 0;
            if(i<=5000)
                ticheng=i*0.08;
            else if(i<=10000)
                ticheng=5000*0.08+(i-5000)*0.10;
            else
                ticheng=5000*0.08+5000*0.10+(i-10000)*0.12;
            if(ticheng+5000>=COMMISSION_SOUGHT)
            {
                System.out.println("You need to sell $"+i);
                break;
            }
        }
    }
}
