import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 doubles: ");
        double[] ass = new double[10];
        for(int i=0;i<10;i++)
            ass[i]=input.nextDouble();
        System.out.println("The average is "+average(ass));
    }
    public static int average(int[] array)
    {
        int sum = 0;
        int len = array.length;
        for (int value : array) sum += value;
        return sum/len;
    }
    public static double average(double[] array)
    {
        double sum=0.0;
        int len = array.length;
        for(double ass : array) sum+=ass;
        return sum/len;
    }
}