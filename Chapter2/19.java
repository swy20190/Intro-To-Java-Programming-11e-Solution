import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of three points separated by spaces");
        System.out.print("like x1 y1 x2 y2 x3 y3:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double s1 = Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5);
        double s2 = Math.pow((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3),0.5);
        double s3 = Math.pow((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3),0.5);
        double s = (s1+s2+s3)/2;
        double a = Math.pow(s*(s-s1)*(s-s2)*(s-s3),0.5);
        System.out.println("The area of the triangle is "+a);
    }
}
