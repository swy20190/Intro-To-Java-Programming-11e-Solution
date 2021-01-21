import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 doubles: ");
        double[] ass = new double[10];
        for(int i=0;i<10;i++)
            ass[i]=input.nextDouble();
        selectionSort(ass);
        for(int i=0;i<10;i++)
            System.out.print(ass[i]+" ");
    }
    public static void selectionSort(double[] list)
    {
        for(int i=0;i<list.length-1;i++)
        {
            double currentMax = list[i];
            int currentMaxIndex = i;
            for(int j=i+1;j<list.length;j++)
            {
                if(currentMax<list[j])
                {
                    currentMax=list[j];
                    currentMaxIndex=j;
                }
            }
            if(currentMaxIndex!=i)
            {
                list[currentMaxIndex]=list[i];
                list[i]=currentMax;
            }
        }
    }
}