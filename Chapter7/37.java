import java.util.Scanner;
import java.util.Arrays;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numSlot = input.nextInt();
        int[] slots = new int[numSlot];
        for(int i=0;i<balls;i++)
            drop(numSlot,slots);
        for(int i=max(slots);i>=1;i--)
        {
            for(int j=0;j<numSlot;j++)
            {
                if(slots[j]<i)
                    System.out.print(" ");
                else
                    System.out.print("0");
            }
            System.out.print('\n');
        }
    }
    public static void drop(int numSlot,int[] slots)
    {
        double bias = 0;
        for(int i=0;i<numSlot-1;i++)
        {
            if(Math.random()>0.5)
            {
                bias+=0.5;
                System.out.print('R');
            }
            else
            {
                bias-=0.5;
                System.out.print('L');
            }
        }
        System.out.print('\n');
        if(numSlot%2==1)
            slots[(int)(numSlot/2+bias)]++;
        else
        {
            if(bias>0)
                slots[(int)(numSlot/2-0.5+bias)]++;
            else
                slots[(int)(numSlot/2+bias)]++;
        }
    }
    public static int max(int[] ass)
    {
        int max = ass[0];
        for (int value : ass) {
            if (value > max)
                max = value;
        }
        return max;
    }
}
