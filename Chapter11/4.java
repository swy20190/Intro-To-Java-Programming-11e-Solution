import java.util.Scanner;
import java.util.ArrayList;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter numbers finished with 0: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> ass = new ArrayList<Integer>();
        int tmp=input.nextInt();
        while(tmp!=0){
            ass.add(tmp);
            tmp=input.nextInt();
        }
        System.out.println("The maximum is "+max(ass));
    }
    public static Integer max(ArrayList<Integer> list){
        if(list==null)
            return null;
        else if(list.size()==0)
            return null;
        else
        {
            return java.util.Collections.max(list);
        }
    }
}
