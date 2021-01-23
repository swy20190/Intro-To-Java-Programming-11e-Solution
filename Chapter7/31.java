import java.util.Scanner;
public class book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int num1 = input.nextInt();
        int[] l1  =new int[num1];
        for(int i=0;i<num1;i++)
            l1[i]=input.nextInt();
        System.out.print("Enter list2 size and contents: ");
        int num2 = input.nextInt();
        int[] l2  =new int[num2];
        for(int i=0;i<num2;i++)
            l2[i]=input.nextInt();
       int[] ass=merge(l1,l2);
       System.out.print("list 1 is ");
       for(int i=0;i<num1;i++)
           System.out.print(l1[i]+" ");
       System.out.print('\n');
       System.out.print("list 2 is ");
       for(int i=0;i<num2;i++)
           System.out.print(l2[i]+" ");
       System.out.print('\n');
       System.out.print("The merged list is ");
       for(int i=0;i<num1+num2;i++)
           System.out.print(ass[i]+" ");
       System.out.print('\n');
    }
    public static int[] merge(int[] list1,int[] list2)
    {
        int l1=list1.length;
        int l2=list2.length;
        int l=l1+l2;
        int[] ass = new int[l];
        int count=0;
        int ptr1 = 0;
        int ptr2 = 0;
        while(ptr1<l1&&ptr2<l2)
        {
            if(list1[ptr1]<list2[ptr2]) {
                ass[count] = list1[ptr1];
                count++;
                ptr1++;
            }
            else{
                ass[count]=list2[ptr2];
                count++;
                ptr2++;
            }
        }
        if(ptr1<l1-1)
        {
            for(int i=count;i<=l1+l2-1;i++)
            {
                ass[i]=list1[ptr1];
                ptr1++;
            }
        }
        else if(ptr2<l2-1)
        {
            for(int i=count;i<=l1+l2-1;i++)
            {
                ass[i]=list2[ptr2];
                ptr2++;
            }
        }
        return ass;
    }
}
