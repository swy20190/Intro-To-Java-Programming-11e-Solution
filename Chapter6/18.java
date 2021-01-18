import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your password: ");
        String dick = input.next();
        if(isValid(dick))
            System.out.println("Valid Password.");
        else
            System.out.println("Invalid Password.");
    }
   public static boolean isValid(String ass)
   {
       int len = ass.length();
       int count=0;
       if(len<8)
           return false;
       for(int i=0;i<len;i++)
       {
           char tmp=ass.charAt(i);
           if((tmp<='z'&&tmp>='a')||(tmp<='Z'&&tmp>='A')||(tmp<='9'&&tmp>='0')) {
           }
           else
               return false;
       }
       for(int i=0;i<len;i++)
       {
           char tmp=ass.charAt(i);
           if(tmp<='9'&&tmp>='0')
               count++;
       }
       return count >= 2;
   }
}