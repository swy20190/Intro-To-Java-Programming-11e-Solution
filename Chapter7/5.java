import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] ass = new int[12];
        int ptr = 0;
        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++)
        {
            int tmp=input.nextInt();
            boolean in = false;
            for(int j=0;j<ptr;j++)
            {
                if(ass[j]==tmp)
                {
                    in=true;
                    break;
                }
            }
            if(!in)
            {
                ass[ptr]=tmp;
                ptr++;
            }
        }
        System.out.println("The number of distinct number is "+ptr);
        System.out.print("The distinct numbers are: ");
        for(int i=0;i<ptr;i++)
            System.out.print(ass[i]+" ");
    }

}