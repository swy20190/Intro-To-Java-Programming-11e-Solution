import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Input 3 integers:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1>num2)
        {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if(num2>num3)
        {
            int tmp = num2;
            num2 = num3;
            num3 = tmp;
        }
        if(num1>num2)
        {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        System.out.println(num1+" "+num2+" "+num3);
    }
}
