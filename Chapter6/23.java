import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.next();
        System.out.print("Enter the char: ");
        char c = input.next().charAt(0);
        System.out.println("The number of "+c+" in "+s+" is "+count(s,c));
    }
    public static int count(String str, char a)
    {
        int jb=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==a)
                jb++;
        }
        return jb;
    }
}