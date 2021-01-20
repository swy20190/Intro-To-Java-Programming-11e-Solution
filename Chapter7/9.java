import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 doubles: ");
        double[] ass = new double[10];
        for(int i=0;i<10;i++)
            ass[i]=input.nextDouble();
        System.out.println("The minimum number is "+min(ass));
    }
    public static double min(double[] array)
    {
        double ss = array[0];
        for (double v : array) {
            if (v < ss)
                ss = v;
        }
        return ss;
    }
}