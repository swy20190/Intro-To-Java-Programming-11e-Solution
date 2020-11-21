import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT:");
        long offset = input.nextLong();
        long totalMilliseconds = System.currentTimeMillis();
        totalMilliseconds+=offset*60*60*1000;
        long totalSeconds = totalMilliseconds/1000;
        long currentSecond = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinute = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHour = totalHours%24;
        String tail = "AM";
        if(currentHour>12)
        {
            currentHour-=12;
            tail="PM";
        }
        System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" "+tail);
    }
}