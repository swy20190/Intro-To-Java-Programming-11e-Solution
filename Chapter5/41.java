import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int maxCount = 0;
        System.out.print("Enter numbers: ");
        while(true)
        {
            int ass = input.nextInt();
            if(ass==0)
                break;
            else
            {
                if(ass>max)
                {
                    max=ass;
                    maxCount=1;
                }
                else if(ass==max)
                    maxCount++;
            }
        }
        System.out.println("The largest number is "+max);
        System.out.println("The occurrence count of the largest number is "+maxCount);
    }
}
