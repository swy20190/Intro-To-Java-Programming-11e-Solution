import java.util.Scanner;
import java.util.ArrayList;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> jesus = new ArrayList<>();
        for(int i=0;i<10;i++){
            int  tmp = input.nextInt();
            jesus.add(tmp);
        }
        removeDuplicate(jesus);
        for (Integer integer : jesus) System.out.print(integer + " ");
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        int ptr=0;
        while(ptr<list.size()){
            int tmp = list.get(ptr);
            if(list.indexOf(tmp)!=ptr)
                list.remove(ptr);
            else
                ptr++;
        }
    }
}
