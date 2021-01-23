import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter thr number of values: ");
        int num = input.nextInt();
        System.out.print("Enter the values: ");
        int[] s = new int[num];
        for(int i=0;i<num;i++)
            s[i]=input.nextInt();
        if(isConsecutiveFour(s))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] values)
    {
        boolean ass=false;
        int base=values[0];
        int count=1;
        for(int i=1;i<values.length;i++)
        {
            if(values[i]==base)
                count++;
            else
            {
                base=values[i];
                count=1;
            }
            if(count==4)
            {
                ass=true;
                break;
            }
        }
        return ass;
    }
}
