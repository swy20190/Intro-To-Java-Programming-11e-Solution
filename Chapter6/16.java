public class book {
    public static void main(String[] args)
    {
        for(int i=2000;i<=2020;i++)
            System.out.println(i+" has "+numberOfDyaInYear(i)+" days.");
    }
    public static int numberOfDyaInYear(int year)
    {
        if((year%4==0&&year%100!=0)||(year%400==0))
            return 366;
        else
            return 365;
    }
}