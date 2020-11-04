import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years:");
        int year = input.nextInt();
        double base = 312032486;
        int secnum = 365*24*3600;
        for(int i=1;i<=year;i++)
            base=base+secnum/7.0-secnum/13.0+secnum/45.0;
        System.out.println("The population in "+year+" years is "+base+".");
    }
}
