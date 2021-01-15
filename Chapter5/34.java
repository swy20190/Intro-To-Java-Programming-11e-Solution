import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int comWin = 0;
        int manWin = 0;
        String[] ass = {"stone","scissors","paper"};
        while(comWin<=2&&manWin<=2)
        {
            System.out.print("Enter 0 for stone, 1 for scissors, 2 for paper:");
            int ren = input.nextInt();
            int jizi = (int)(Math.random()*3);
            if(jizi-ren==-1||jizi-ren==2)
            {
                System.out.println("Computer is "+ass[jizi]+", you are "+ass[ren]+". You lose!");
                comWin++;
            }
            else if(ren-jizi==-1||ren-jizi==2)
            {
                System.out.println("Computer is "+ass[jizi]+", you are "+ass[ren]+". You win!");
                manWin++;
            }
            else
                System.out.println("Computer is "+ass[jizi]+", you are "+ass[ren]+". It is a draw.");
        }
    }
}
