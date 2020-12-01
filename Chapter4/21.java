import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter a SSN: ");
        Scanner input = new Scanner(System.in);
        String ass = input.next();
        boolean valid = true;
        if(ass.length()!=11)
            valid=false;
        else
        {
            for(int i=0;i<=2;i++)
                valid=valid&&(ass.charAt(i)>='0'&&ass.charAt(i)<='9');
            valid=valid&&(ass.charAt(3)=='-');
            for(int i=4;i<=5;i++)
                valid=valid&&(ass.charAt(i)>='0'&&ass.charAt(i)<='9');
            valid=valid&&(ass.charAt(6)=='-');
            for(int i=7;i<=10;i++)
                valid=valid&&(ass.charAt(i)>='0'&&ass.charAt(i)<='9');
        }
        if(valid)
            System.out.println(ass+" is a valid SSN");
        else
            System.out.println(ass+" is an invalid SSN");
    }
}
