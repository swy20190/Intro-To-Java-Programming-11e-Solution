import java.util.GregorianCalendar;
public class book {
    public static void main(String[] args)
    {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.get(GregorianCalendar.YEAR)+"/"+g.get(GregorianCalendar.MONTH)+"/"+g.get(GregorianCalendar.DAY_OF_MONTH));
        g.setTimeInMillis(123456789876L);
        System.out.println(g.get(GregorianCalendar.YEAR)+"/"+g.get(GregorianCalendar.MONTH)+"/"+g.get(GregorianCalendar.DAY_OF_MONTH));
    }
}