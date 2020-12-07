import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
       System.out.print("Enter the number of girls: ");
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       String name = "";
       String name2 = "";
       double cup = 0;
       double cup2 = 0;
       for(int i=0;i<num;i++)
       {
           String tname = input.next();
           double tmp = input.nextDouble();
           if(tmp>cup)
           {
               cup2=cup;
               name2 = name;
               cup=tmp;
               name=tname;
           }
           else if(tmp>cup2)
           {
               cup2=tmp;
               name2=tname;
           }
       }
       System.out.println("The hottest girl is "+name);
       System.out.println("The second hottest girl is "+name2);
    }
}