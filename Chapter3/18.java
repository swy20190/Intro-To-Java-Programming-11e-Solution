import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter the weight:");
        Scanner input = new Scanner(System.in);
        double w = input.nextDouble();
        double c = 0;
        if(w>20)
            System.out.println("the package cannot be shipped");
        else if(w<=0)
            System.out.println("Invalid input");
        else if(w<=1)
            c=3.5;
        else if(w<=3)
            c=5.5;
        else if(w<=10)
            c=8.5;
        else if(w<=20)
            c=10.5;
        if(c!=0)
            System.out.println("The cost is "+c);
    }
}
