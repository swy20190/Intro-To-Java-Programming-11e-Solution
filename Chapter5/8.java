import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
       System.out.println("Enter the number of girls: ");
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       String name = "";
       double cup = 0;
       for(int i=0;i<num;i++)
       {
           String tname = input.next();
           double tmp = input.nextDouble();
           if(tmp>cup)
           {
               cup=tmp;
               name=tname;
           }
       }
       System.out.println("The hottest girl is "+name);
    }
}