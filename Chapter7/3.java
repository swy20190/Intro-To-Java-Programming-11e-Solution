import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[101];
        for(int i=0;i<101;i++)
            counts[i]=0;
        System.out.print("Enter the integers between 1 and 100: ");
        while(true)
        {
            int tmp=input.nextInt();
            counts[tmp]++;
            if(tmp==0)
                break;
        }
        for(int i=1;i<=100;i++)
        {
            if(counts[i]!=0)
            {
                if(counts[i]>1)
                    System.out.printf("%d occurs %d times\n",i,counts[i]);
                else
                    System.out.printf("%d occurs 1 time\n",i);
            }
        }
    }

}