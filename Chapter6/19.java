import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double s1=input.nextDouble();
        double s2=input.nextDouble();
        double s3=input.nextDouble();
        if(isValid(s1,s2,s3))
            System.out.println("The area is "+area(s1,s2,s3));
        else
            System.out.println("The input is invalid.");
    }
    public static boolean isValid(
            double side1,double side2,double side3
    )
    {
        return !(side1 >= side2 + side3) && !(side2 >= side1 + side3) && !(side3 >= side1 + side2);
    }
    public static double area(
            double side1,double side2,double side3
    )
    {
        double p=(side1+side2+side3)/2.0;
        double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return area;
    }
}