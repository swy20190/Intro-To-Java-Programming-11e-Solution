import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list1 size: ");
        int num1 = input.nextInt();
        System.out.print("Enter list contents: ");
        int[] l1  =new int[num1];
        for(int i=0;i<num1;i++)
            l1[i]=input.nextInt();
        partition(l1);
        System.out.print("After the partition, the list is ");
        for(int i=0;i<num1;i++)
            System.out.print(l1[i]+" ");
        System.out.print('\n');
    }
    public static int partition(int[] list)
    {
        int len = list.length;
        int[] help = new int[2*len];
        int pivot = list[0];
        help[len+1]=list[0];
        int ptr1 = len;
        int ptr2 = len+2;
        for(int i=1;i<len;i++)
        {
            if(list[i]>pivot)
            {
                help[ptr2]=list[i];
                ptr2++;
            }
            else
            {
                help[ptr1]=list[i];
                ptr1--;
            }
        }
        for(int i=0;i<len;i++)
            list[i]=help[ptr1+1+i];
        return len-ptr1;
    }
}
