import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 doubles: ");
        double[] ass = new double[10];
        for(int i=0;i<10;i++)
            ass[i]=input.nextDouble();
        System.out.println("The mean is "+mean(ass));
        System.out.println("The standard deviation is "+deviation(ass));
    }
    public static double deviation(double[] x)
    {
        double sum=0;
        double mean=mean(x);
        for(double v:x)sum+=Math.pow(v-mean,2);
        return Math.sqrt(sum/(x.length-1));
    }
    public static double mean(double[] x)
    {
        double sum=0;
        for (double v : x) sum += v;
        return sum/x.length;
    }
}