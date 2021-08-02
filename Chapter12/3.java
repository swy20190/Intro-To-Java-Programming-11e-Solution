import java.util.*;

public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] ass = new int[100];
        for(int i=0;i<100;i++)
            ass[i]=(int)(Math.random()*100);
        System.out.print("Enter your index: ");
        int index = input.nextInt();
        try{
            int jj = ass[index];
        }
        catch (ArrayIndexOutOfBoundsException k){
            System.out.println("Out of Bounds!");
            System.exit(1);
        }
        System.out.println("The number of the index is "+ass[index]);
    }
}
