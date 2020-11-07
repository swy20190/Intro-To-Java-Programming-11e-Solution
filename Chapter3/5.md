import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day:");
        int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int plus = input.nextInt();
        int result = (day+plus)%7;
        String[] days = {"Sun","Mon","Tues","Wed","Thu","Fri","Sat"};
        System.out.println("Today is "+days[day]+" and the future day is "+days[result]);
    }
}
