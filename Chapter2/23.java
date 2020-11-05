import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance:");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon:");
        double youhao = input.nextDouble();
        System.out.print("Enter price per gallon:");
        double youjia = input.nextDouble();
        double price = distance/youhao*youjia;
        System.out.println("The cost of driving is $"+price);
    }
}
