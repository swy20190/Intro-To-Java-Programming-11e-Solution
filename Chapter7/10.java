import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 doubles: ");
        double[] ass = new double[10];
        for(int i=0;i<10;i++)
            ass[i]=input.nextDouble();
        System.out.println("The lowest index is "+indexOfSmallestElement(ass));
    }
    public static int indexOfSmallestElement(double[] array)
    {
        int ss = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<array[ss])
                ss=i;
        }
        return ss;
    }
}