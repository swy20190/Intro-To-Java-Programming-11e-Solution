import java.util.Scanner;
import java.util.Arrays;
public class book {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int s1 = input.nextInt();
        int[] l1 = new int[s1];
        for(int i=0;i<s1;i++)
            l1[i]=input.nextInt();
        System.out.print("Enter list2 size and contents: ");
        int s2 = input.nextInt();
        int[] l2 = new int[s2];
        for(int i=0;i<s2;i++)
            l2[i]=input.nextInt();
        Arrays.sort(l1);
        Arrays.sort(l2);
        if(equals(l1,l2))
            System.out.println("Two lists are identical");
        else
            System.out.println("Two lists are not identical");
    }
    public static boolean equals(int[] list1,int[] list2)
    {
        int l1 = list1.length;
        int l2 = list2.length;
        if(l1!=l2)
            return false;
        else
        {
            for(int i=0;i<l1;i++)
            {
                if(list1[i]!=list2[i])
                    return false;
            }
            return true;
        }
    }
}
