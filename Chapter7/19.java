import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int num = input.nextInt();
        int[] ass = new int[num];
        System.out.print("Enter the contents of the list: ");
        for(int i=0;i<num;i++)
            ass[i]=input.nextInt();
        System.out.print("The list has "+num+" integer(s)");
        for(int i=0;i<num;i++)
            System.out.print(" "+ass[i]);
        System.out.print('\n');
        if(isSorted(ass))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");
    }
    public static boolean isSorted(int[] list)
    {
        int len=list.length;
        if(len==1||len==0)
            return true;
        else
        {
            for(int i=0;i<len-1;i++)
            {
                if(list[i]>list[i+1])
                    return false;
            }
        }
        return true;
    }
}