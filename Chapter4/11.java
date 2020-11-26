import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter a decimal value (0 to 15): ");
        Scanner input = new Scanner(System.in);
        int ass = input.nextInt();
        if(ass>=0&&ass<=15){
            if(ass<10)
                System.out.printf("The hex value is %d",ass);
            else
                System.out.printf("The hex value is %c",'A'+ass-10);
        }
        else
            System.out.printf("%d is an invalid input",ass);
    }
}
