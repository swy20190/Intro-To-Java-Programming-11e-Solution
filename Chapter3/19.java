import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter the three lengths:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double cir = a+b+c;
        if((2*a>=cir)||(2*b>=cir)||(2*c>=cir))
            System.out.println("Invalid input");
        else
            System.out.println("The circumference is "+cir);
    }
}
