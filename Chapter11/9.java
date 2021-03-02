import java.util.Scanner;
import java.util.ArrayList;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int ass = input.nextInt();
        int[][] dick = new int[ass][ass];
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();
        for(int i=0;i<ass;i++)
        {
            for(int j=0;j<ass;j++)
                dick[i][j]=(int)(Math.random()*2);
        }
        for(int i=0;i<ass;i++)
        {
            int sum=0;
            for(int j=0;j<ass;j++){
                if(dick[i][j]==1)
                    sum++;
            }
            rows.add(sum);
        }
        for(int j=0;j<ass;j++)
        {
            int sum=0;
            for(int i=0;i<ass;i++){
                if(dick[i][j]==1)
                    sum++;
            }
            columns.add(sum);
        }
        System.out.println("The random array is ");
        for(int i=0;i<ass;i++){
            for(int j=0;j<ass;j++){
                System.out.print(dick[i][j]+" ");
            }
            System.out.print('\n');
        }
        System.out.println("The largest row index: "+java.util.Collections.max(rows));
        System.out.println("The largest column index: "+java.util.Collections.max(columns));
    }
}
