import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet:");
        double feet = input.nextDouble();
        double meters = feet*0.305;
        System.out.println(feet+" feet is "+meters+" meters.");
    }
}
