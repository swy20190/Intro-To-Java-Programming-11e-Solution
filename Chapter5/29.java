import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        String[] days={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        int[] numDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%4==0&&year%100!=0)||(year%400==0))
            numDays[1]=29;
        System.out.print("Enter the day: ");
        int day = input.nextInt();
        for(int i=1;i<=12;i++)
        {
            System.out.println("              "+months[i-1]+" "+year+"           ");
            System.out.println("=======================================");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
            int count = 0;
            int base = 0;
            for(int j=0;j<day;j++)
            {
                System.out.print("      ");
                count++;
            }
            for(int j=1;j<=numDays[i-1];j++)
            {
                System.out.printf("%2d    ",j);
                count++;
                if(count%7==0&&count!=base)
                {
                    System.out.print('\n');
                    base+=7;
                }
            }
            System.out.print('\n');
            System.out.print('\n');
            day=(day+numDays[i-1])%7;
        }
    }
}
