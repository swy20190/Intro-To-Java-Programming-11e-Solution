import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] dick = new double[rows][columns];
        System.out.print("Enter the array: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
                dick[i][j]=input.nextDouble();
        }
        Location holy = locateLargest(dick);
        System.out.println("The location of the largest element is "+holy.maxValue+" at ("+holy.row+", "+holy.column+")");
    }
    public static Location locateLargest(double[][] a){
        Location ass = new Location();
        ass.maxValue=a[0][0];
        ass.column=0;
        ass.row=0;
        int rowCount = a.length;
        int columnCount = a[0].length;
        for(int i=0;i<rowCount;i++)
        {
            for(int j=0;j<columnCount;j++)
            {
                if(a[i][j]>ass.maxValue)
                {
                    ass.row=i;
                    ass.maxValue=a[i][j];
                    ass.column=j;
                }
            }
        }
        return ass;
    }
}

class Location
{
    public int row;
    public int column;
    public double maxValue;
}