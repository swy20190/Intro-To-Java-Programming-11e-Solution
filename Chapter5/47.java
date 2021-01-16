import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits:");
        String ass = input.nextLine();
        if(ass.length()!=12)
            System.out.println(ass+" is invalid.");
        else
        {
            int sum=0;
            for(int i=0;i<12;i++)
            {
                int tmp = ass.charAt(i)-'0';
                if(i%2==1)
                    sum+=tmp;
                else
                    sum+=3*tmp;
            }
            int tail = 10-sum%10;
            if(tail==10)
                tail=0;
            System.out.println("The ISBN-13 number is "+ass+tail);
        }
    }
}
