import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 doubles: ");
        double[] ass = new double[10];
        for(int i=0;i<10;i++)
            ass[i]=input.nextDouble();
        reverse(ass);
        for(double v:ass) System.out.print(v+" ");
    }
    public static double[] reverse(double[] ass)
    {
        int len = ass.length;
        for(int i=0;i<len/2;i++)
        {
            double tmp = ass[i];
            ass[i]=ass[len-i-1];
            ass[len-i-1]=tmp;
        }
        return ass;
    }
}