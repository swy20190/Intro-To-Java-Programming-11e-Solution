import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double sum = 0;
        double sumQ = 0;
        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++)
        {
            double tmp=input.nextDouble();
            sum+=tmp;
            sumQ+=tmp*tmp;
        }
        double means = sum/10.0;
        double sd = Math.sqrt((sumQ-sum*sum/10.0)/9.0);
        System.out.println("The mean is "+means);
        System.out.println("The standard deviation is "+sd);
    }
}
