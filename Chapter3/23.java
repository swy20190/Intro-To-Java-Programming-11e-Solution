import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x<=10/2&&x>=-10/2&&y<=5.0/2&&y>=-5.0/2)
            System.out.println("Point ("+x+", "+y+") is in the rectangle");
        else
            System.out.println("Point ("+x+", "+y+") is not in the rectangle");
    }
}
