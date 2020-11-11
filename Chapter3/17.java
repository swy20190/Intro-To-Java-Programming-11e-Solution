import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("scissor(0), rock(1), paper(2):");
        Scanner input = new Scanner(System.in);
        int player = input.nextInt();
        int com  = (int)(Math.random()*3);
        String[] names = {"scissor","rock","paper"};
        if(com==player)
            System.out.println("The computer is "+names[com]+". You are "+names[player]+" too. It is a draw.");
        else{
            System.out.print("The computer is "+names[com]+". You are "+names[player]+". You ");
            String result = "";
            if((com==0&&player==1)||(com==1&&player==2)||(com==2&&player==0))
                result="win";
            else
                result="lose";
            System.out.println(result);
        }
    }
}
