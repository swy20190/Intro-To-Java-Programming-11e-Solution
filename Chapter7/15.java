import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        int[] ass = new int[10];
        for(int i=0;i<10;i++)
        {
            ass[i]=input.nextInt();
        }
        int[] jj = eliminateDuplications(ass);
        System.out.print("The distinct numbers are: ");
        for (int value : jj) System.out.print(value + " ");
    }
    public static int[] eliminateDuplications(int[] list)
    {
        int ptr = 0;
        int len = list.length;
        int[] ass = new int[len];
        for (int item : list) {
            int occur = 0;
            for (int j=0;j<ptr;j++) {
                if (item == ass[j])
                    occur++;
            }
            if (occur == 0) {
                ass[ptr] = item;
                ptr++;
            }
        }
        int[] dick = new int[ptr];
        System.arraycopy(ass, 0, dick, 0, ptr);
        return dick;
    }
}