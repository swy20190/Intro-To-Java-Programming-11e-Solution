public class book {
    public static void main(String[] args)
    {
        System.out.println("i\t\tm(i)");
        System.out.println("--------------");
        for(int i=1;i<=20;i++)
            System.out.printf("%-2d\t\t%7.4f\n",i,m(i));
    }
    public static double m(int n)
    {
        double sum=0.0;
        for(int i=1;i<=n;i++)
            sum+=1.0*i/(i+1);
        return sum;
    }
}
