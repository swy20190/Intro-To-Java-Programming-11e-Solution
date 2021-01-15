import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        String[] days={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        int[] numDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%4==0&&year%100!=0)||(year%400==0))
            numDays[1]=29;
        System.out.print("Enter the day: ");
        int day = input.nextInt();
        for(int i=1;i<=12;i++)
        {
            System.out.printf("%s 1, %d is %s\n", months[i - 1], year, days[day-1]);
            day=(day+numDays[i-1])%7;
            if(day==0)
                day=7;
        }
    }
}
