import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a integer: ");
        long ass = input.nextLong();
        System.out.println("The root is "+sqrt(ass));
    }
    public static double sqrt(long n)
    {
        double lastGuess = 1.0;
        double nextGuess = (lastGuess+n/lastGuess)/2;
        while(Math.abs(lastGuess-nextGuess)>0.0001)
        {
            lastGuess=nextGuess;
            nextGuess=(nextGuess+n/nextGuess)/2;
        }
        return nextGuess;
    }
}