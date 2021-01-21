import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        String[] ass = new String[num];
        System.out.print("Enter the names of the students: ");
        for(int i=0;i<num;i++)
            ass[i]=input.next();
        int[] dick = new int[num];
        System.out.print("Enter the scores of the students: ");
        for(int i=0;i<num;i++)
            dick[i]=input.nextInt();
        int[] keys = new int[num];
        for(int i=0;i<num;i++)
            keys[i]=i;
        for(int j=num-1;j>=2;j--)
        {
            for(int i=0;i<j;i++)
                if(dick[i]<dick[i+1])
                {
                    int tmp=keys[i];
                    keys[i]=keys[i+1];
                    keys[i+1]=tmp;
                }
        }
        for(int i=0;i<num;i++)
            System.out.print(ass[keys[i]]+" ");
    }

}