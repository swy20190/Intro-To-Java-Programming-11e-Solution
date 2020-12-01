import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String ass1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String ass2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String ass3 = input.nextLine();
        if(ass1.compareTo(ass2)>0)
        {
            String ass0 = ass1;
            ass1 = ass2;
            ass2 = ass0;
        }
        if(ass2.compareTo(ass3)>0)
        {
            String ass0 = ass2;
            ass2 = ass3;
            ass3 = ass0;
        }
        if(ass1.compareTo(ass2)>0)
        {
            String ass0 = ass1;
            ass1 = ass2;
            ass2 = ass0;
        }
        System.out.printf("The three cities in alphabetical order are %s %s %s",ass1,ass2,ass3);
    }
}
