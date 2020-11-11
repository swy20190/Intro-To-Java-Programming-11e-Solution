import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        int[] mdays = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e,g.,2012):");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0))
            mdays[1]=29;
        System.out.print("Enter the day of the month: 1-"+mdays[month-1]+": ");
        int q = input.nextInt();
        if(month==1||month==2){
            month+=12;
            year--;
        }
        int h=(q+26*(month+1)/10+year%100+year%100/4+year/100/4+5*(year/100))%7;
        String[] days = {"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
        System.out.println("Day of the week is "+days[h]);
    }
}
