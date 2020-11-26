import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ent6er an ASCII code: ");
        int ass = input.nextInt();
        char dick = (char)ass;
        System.out.printf("The character for ASCII code %d is %c",ass,dick);
    }
}
