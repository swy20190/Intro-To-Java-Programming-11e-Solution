import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=input.nextInt();
        System.out.print("Enter the width : ");
        int w = input.nextInt();
        System.out.println("The format of the number is "+format(n,w));
    }
    public static String format(int number,int width)
    {
        String ass = Integer.toString(number);
        int len = ass.length();
        if(len>=width)
            return ass;
        else
        {
            String dick="";
            for(int i=1;i<=width-len;i++)
                dick+='0';
            return dick+ass;
        }
    }
}
