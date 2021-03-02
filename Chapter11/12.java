import java.util.Scanner;
import java.util.ArrayList;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter 5 integers: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> jesus = new ArrayList<>();
        for(int i=0;i<5;i++){
            int tmp = input.nextInt();
            jesus.add(tmp);
        }
        sort(jesus);
        for(int i=0;i<5;i++)
            System.out.print(jesus.get(i)+" ");
    }
    public static void sort(ArrayList<Integer> list){
        java.util.Collections.sort(list);
    }
}
