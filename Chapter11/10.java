import java.util.Scanner;
import java.util.ArrayList;
public class book {
    public static void main(String[] args)
    {
        System.out.print("Enter 5 strings: ");
        Scanner input = new Scanner(System.in);
        MyStack ass = new MyStack();
        for(int i=0;i<5;i++)
        {
            String tmp = input.next();
            ass.push(tmp);
        }
        while(!ass.isEmpty())
            System.out.println(ass.pop());
    }
}

class MyStack extends ArrayList
{
    public void push(Object o){
        super.add(o);
    }
    public Object pop(){
        Object ass = super.get(size()-1);
        super.remove(size()-1);
        return ass;
    }
    public boolean isEmpty(){
        return super.isEmpty();
    }
}
