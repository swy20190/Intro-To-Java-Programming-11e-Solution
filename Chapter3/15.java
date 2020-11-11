import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        int lottery = (int)(Math.random()*1000);
        int ld1 = lottery%10;
        int ld2 = lottery/10%10;
        int ld3 = lottery/100%10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your pick: ");
        int guess = input.nextInt();
        int g1 = guess%10;
        int g2 = guess/10%10;
        int g3 = guess/100%10;
        System.out.println("The lottery number is "+lottery);
        if(guess==lottery)
            System.out.println("you win $10,000");
        else if((g1==ld1&&g2==ld3&&g3==ld2)||(g1==ld2&&g2==ld1&&g3==ld3)||(g1==ld2&&g2==ld3&&g3==ld1)||(g1==ld3&&g2==ld1&&g3==ld2)||(g1==ld3&&g2==ld2&&g3==ld1))
            System.out.println("you win $3000");
        else if(g1==ld1||g1==ld2||g1==ld3||g2==ld1||g2==ld2||g2==ld3||g3==ld1||g3==ld2||g3==ld3)
            System.out.println("you win $1000");
        else
            System.out.println("bad luck!");
    }
}
