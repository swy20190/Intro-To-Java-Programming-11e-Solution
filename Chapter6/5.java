import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 3 doubles: ");
        double d1=input.nextDouble();
        double d2=input.nextDouble();
        double d3=input.nextDouble();
        displaySortedNumbers(d1,d2,d3);
    }
    public static void displaySortedNumbers(
            double num1,double num2,double num3
    )
    {
        if(num1>num2)
        {
            double tmp=num1;
            num1=num2;
            num2=tmp;
        }
        if(num2>num3)
        {
            double tmp=num2;
            num2=num3;
            num3=tmp;
        }
        if(num1>num2)
        {
            double tmp=num1;
            num1=num2;
            num2=tmp;
        }
        System.out.println(num1+" "+num2+" "+num3);
    }
}
