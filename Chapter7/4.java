import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] occurs = new int[101];
        int sum=0;
        int count = 0;
        while(true)
        {
            int tmp = input.nextInt();
            if(tmp<0)
                break;
            occurs[tmp]++;
            sum+=tmp;
            count++;
        }
        double avg = 1.0*sum/count;
        int lower = 0;
        for(int i=0;i<avg;i++)
        {
            lower+=occurs[i];
        }
        System.out.println(lower+" students are lower than average.");
        System.out.println((count-lower)+" students are not lower than average.");
    }

}