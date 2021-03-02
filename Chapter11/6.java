import java.util.ArrayList;
import java.util.Date;
public class book {
    public static void main(String[] args)
    {
        ArrayList<Object> ass = new ArrayList<>();
        String animal = "114514";
        Date dday = new Date();
        ass.add(animal);
        ass.add(dday);
        for (Object o : ass) {
            System.out.println(o.toString());
        }
    }

}
