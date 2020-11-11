import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        int coin = (int)(Math.random()*2);
        System.out.print("Guess: ");
        Scanner input = new Scanner(System.in);
        int g = input.nextInt();
        if(g==coin)
            System.out.println("You are right, coin is "+coin);
        else
            System.out.println("You are wrong, coin is "+coin);
    }
}
