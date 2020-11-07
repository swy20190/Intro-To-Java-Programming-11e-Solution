import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = input.nextInt();
        System.out.print("Enter the year number: ");
        int year = input.nextInt();
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] monthNames={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        boolean isLeapYear = (year%4==0&&year%100!=0)||(year%400==0);
        if(isLeapYear)
            months[1]=29;
        System.out.println(monthNames[month-1]+" "+year+" has "+months[month-1]+" days.");
    }
}
