import java.util.Scanner;
import java.util.ArrayList;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter 5 integers for list1: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> jostar = new ArrayList<>();
        for(int i=0;i<5;i++){
            int  tmp = input.nextInt();
            jostar.add(tmp);
        }
        System.out.print("Enter 5 integers for list2: ");
        ArrayList<Integer> joseph = new ArrayList<>();
        for(int i=0;i<5;i++){
            int  tmp = input.nextInt();
            joseph.add(tmp);
        }
        ArrayList<Integer> dio = union(jostar,joseph);
        for(int j:dio)
            System.out.print(j+" ");
    }
    public static ArrayList<Integer> union(
            ArrayList<Integer> list1,ArrayList<Integer> list2
    ){
        ArrayList<Integer> josuke = new ArrayList<>();
        josuke.addAll(list1);
        josuke.addAll(list2);
        return josuke;
    }
}
