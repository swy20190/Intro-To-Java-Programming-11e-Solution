import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String ass = input.next();
        char d1 = ass.charAt(0);
        char d2 = ass.charAt(1);
        String dept = "";
        String grade = "";
        if((d1=='M'||d1=='C'||d1=='I')&&(d2>='1'&&d2<='4'))
        {
            if(d1=='M')
                dept="Mathematics";
            else if(d1=='C')
                dept="Computer science";
            else
                dept="IT";
            if(d2=='1')
                grade="Freshman";
            else
                grade="Junior";
            System.out.printf("%s %s\n",dept,grade);
        }
        else
            System.out.println("Invalid input");
    }
}
